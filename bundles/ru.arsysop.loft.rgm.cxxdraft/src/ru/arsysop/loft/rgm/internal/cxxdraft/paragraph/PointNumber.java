package ru.arsysop.loft.rgm.internal.cxxdraft.paragraph;

import java.util.function.Function;

import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.spec.model.api.DomElement;

public final class PointNumber implements Function<DomElement, String> {

	@Override
	public String apply(DomElement node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("marginalizedparent")) //$NON-NLS-1$
				.map(e -> e.element("a").get()) //$NON-NLS-1$
				.map(DomElement::text) //
				.findAny().orElse(""); //$NON-NLS-1$
	}

}
