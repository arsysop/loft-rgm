/*******************************************************************************
 * Copyright (c) 2022 ArSysOp.
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
package ru.arsysop.loft.rgm.internal.synopsis.editor;

import ru.arsysop.loft.rgm.base.workbench.editors.DefaultFileDomain;
import ru.arsysop.loft.rgm.base.workbench.wizards.EmfModelWizard;
import ru.arsysop.loft.rgm.seal.RgmFeatures;
import ru.arsysop.loft.rgm.synopsis.edit.SynopsisEditPlugin;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;

public final class SynopsisModelWizard extends EmfModelWizard {

	public SynopsisModelWizard() {
		super(SynopsisEditPlugin.INSTANCE, //
				SynopsisPackage.eINSTANCE.getHeaderSynopsis(), //
				new DefaultFileDomain(), //
				() -> "synopsis", //$NON-NLS-1$
				new RgmFeatures.Synopsis().editor()
		);
	}

}
