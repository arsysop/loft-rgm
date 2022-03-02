/*******************************************************************************
 * Copyright (c) 2021 ArSysOp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.internal.spec.workbench.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.FrameworkUtil;

import ru.arsysop.loft.rgm.spec.model.api.Document;
import ru.arsysop.loft.rgm.spec.workspace.interchange.ImportSpecificationContent;

public final class ImportSpecHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// FIXME: AF: check license here
		Arrays.stream(HandlerUtil.getCurrentStructuredSelection(event).toArray())//
				.filter(Document.class::isInstance)//
				.map(Document.class::cast)//
				.findFirst()
				.ifPresent(d -> importContent(d, event));
		return null;
	}

	private void importContent(Document document, ExecutionEvent event) {
		String from = "https://timsong-cpp.github.io/cppwp/n4140/"; //$NON-NLS-1$
		Shell shell = HandlerUtil.getActiveShell(event);
		ProgressMonitorDialog pmd = new ProgressMonitorDialog(shell);
		try {
			pmd.run(true, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						new ImportSpecificationContent(document, from).run(monitor);
					} catch (CoreException e) {
						throw new InvocationTargetException(e);
					}
				}
			});
		} catch (InvocationTargetException e) {
			Throwable target = e.getTargetException();
			IStatus status;
			if (target instanceof CoreException) {
				CoreException ce = (CoreException) target;
				status = ce.getStatus();
			} else {
				status = new Status(IStatus.ERROR, FrameworkUtil.getBundle(getClass()).getSymbolicName(), target.getMessage(), target);
			}
			ErrorDialog.openError(shell, from, from, status);
		} catch (InterruptedException e) {
			// just ignore
		}
	}

}
