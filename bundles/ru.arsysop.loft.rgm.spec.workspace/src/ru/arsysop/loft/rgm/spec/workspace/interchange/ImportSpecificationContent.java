/*******************************************************************************
 * Copyright (c) ArSysOp 2018-2022
 * 
 * RGM Sources are publicly available only for 
 * informational, review, analysis and consulting purposes.
 * 
 * Definitions, terms and conditions for using RGM Sources are stated by ArSysOp Source License version 1.0.
 * See http://arsysop.ru/licenses/rgm/ArSysOpSourceLicense-1.0.txt
 * 
 * RGM Sources are provided on "as is" basis. 
 * ArSysOp is not responsible for any damages, losses, legal prosecution 
 * or other consequences of any sort that using RGM Sources can cause to you 
 * (as an individual or Legal Entity), even if aware of such consequences.
 * 
*******************************************************************************/
package ru.arsysop.loft.rgm.spec.workspace.interchange;

import java.util.Objects;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.osgi.util.NLS;

import ru.arsysop.loft.rgm.cxxdraft.base.InvestigateHtml;
import ru.arsysop.loft.rgm.cxxdraft.base.SimpleResolutionContext;
import ru.arsysop.loft.rgm.internal.spec.workspace.Messages;
import ru.arsysop.loft.rgm.spec.edit.EObjectEditingDomain;
import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.workspace.SpecWorkspaceId;

public final class ImportSpecificationContent implements ICoreRunnable {

	private final Document document;
	private final String from;

	public ImportSpecificationContent(Document document, String from) {
		this.document = Objects.requireNonNull(document, "ImportSpecificationContent::document"); //$NON-NLS-1$
		this.from = Objects.requireNonNull(from, "ImportSpecificationContent::from"); //$NON-NLS-1$
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		try {
			// FIXME: RecordingCommand
			new EObjectEditingDomain().apply(document).getCommandStack().execute(new IdentityCommand(from));
			new InvestigateHtml().prepare(new SimpleResolutionContext(from, document)).run(monitor);
		} catch (CoreException e) {
			throw e;
		} catch (Exception e) {
			String message = NLS.bind(Messages.ImportSpecificationContent_e_import, from);
			throw new CoreException(new Status(IStatus.ERROR, new SpecWorkspaceId().get(), message, e));
		}
	}

}
