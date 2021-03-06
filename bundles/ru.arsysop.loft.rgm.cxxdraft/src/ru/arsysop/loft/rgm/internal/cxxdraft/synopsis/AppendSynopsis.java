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
package ru.arsysop.loft.rgm.internal.cxxdraft.synopsis;

import java.util.function.BiConsumer;

import org.dom4j.Element;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.paragraph.CollectText;
import ru.arsysop.loft.rgm.spec.model.api.Section;
import ru.arsysop.loft.rgm.spec.model.api.Synopsis;
import ru.arsysop.loft.rgm.spec.model.meta.SpecFactory;

public final class AppendSynopsis implements BiConsumer<Section, Element> {

	private final SpecFactory factory = SpecFactory.eINSTANCE;

	private final ResolutionContext context;

	public AppendSynopsis(ResolutionContext context) {
		this.context = context;
	}

	@Override
	public void accept(Section section, Element element) {
		String number = nextNumber(section);
		Synopsis synopsis = factory.createSynopsis();
		synopsis.setRaw(new CollectText().apply(element.element("code"))); //$NON-NLS-1$
		synopsis.setId(section.getId().concat("_synopsis").concat(number)); //$NON-NLS-1$
		synopsis.setName(section.getName().concat(String.format("Synopsis %s", number))); //$NON-NLS-1$
		synopsis.setNumber(section.getNumber().concat(String.format("-S%s", number))); //$NON-NLS-1$
		new SynopsisReferences(context).apply(element).forEach(synopsis.getReferences()::add);
		section.getContents().add(synopsis);
	}

	private String nextNumber(Section paragraph) {
		return String.valueOf(paragraph.getContents().stream() //
				.filter(Synopsis.class::isInstance) //
				.count() + 1);
	}

}
