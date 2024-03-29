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
package ru.arsysop.loft.rgm.cxxdraft.base;

import org.eclipse.core.runtime.ICoreRunnable;

import ru.arsysop.loft.rgm.cxxdraft.InvestigateSpec;
import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.spec.model.api.Revision;

public final class InvestigateHtml implements InvestigateSpec {

	private final Revision revision;

	public InvestigateHtml(Revision revision) {
		this.revision = revision;
	}

	@Override
	public ICoreRunnable prepare(ResolutionContext context) {
		return new InvestigateHtmlTree(context, revision);
	}

}
