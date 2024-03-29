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
package ru.arsysop.loft.rgm.spec.cpp17;

import ru.arsysop.loft.rgm.internal.spec.cpp17.Messages;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;
import ru.arsysop.loft.rgm.spec.model.api.Revision;

public final class Cpp17 implements Revision {

	@Override
	public String url() {
		return "https://timsong-cpp.github.io/cppwp/n4659/"; //$NON-NLS-1$
	}

	@Override
	public String name() {
		return Messages.Cpp17_name;
	}

	@Override
	public DomElement wrapper(DomElement body) {
		return body;
	}

}
