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
package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.PickId;
import ru.arsysop.loft.rgm.spec.model.api.Part;

public final class ParseReferences implements Function<Element, List<Part>> {

	private final ResolutionContext context;

	public ParseReferences(ResolutionContext context) {
		this.context = context;
	}

	@Override
	public List<Part> apply(Element node) {
		return node.elements("a").stream() //$NON-NLS-1$
				.map(a -> a.attributeValue("href")) //$NON-NLS-1$
				.map(new PickId(context)) //
				.map(context.parts()::find) //
				.filter(Optional::isPresent) //
				.map(Optional::get) //
				.collect(Collectors.toList());
	}

}
