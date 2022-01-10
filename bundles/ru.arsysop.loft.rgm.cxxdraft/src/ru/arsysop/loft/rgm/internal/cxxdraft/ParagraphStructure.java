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
 *     Nikifor Fedorov (ArSysOp) - initial API and implementation
 *******************************************************************************/
package ru.arsysop.loft.rgm.internal.cxxdraft;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.dom4j.Element;
import org.dom4j.Node;

import ru.arsysop.loft.rgm.cxxdraft.ResolutionContext;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.IsDiv;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.NullClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.OfClass;
import ru.arsysop.loft.rgm.internal.cxxdraft.element.PickId;
import ru.arsysop.loft.rgm.model.api.Paragraph;
import ru.arsysop.loft.rgm.model.api.Part;
import ru.arsysop.loft.rgm.model.api.Point;
import ru.arsysop.loft.rgm.model.api.StyledLine;
import ru.arsysop.loft.rgm.model.api.StyledNode;
import ru.arsysop.loft.rgm.model.meta.RgmFactory;

public final class ParagraphStructure extends BaseStructure<Paragraph> {

	private final RgmFactory factory;

	protected ParagraphStructure(Paragraph container, ResolutionContext context) {
		super(container, context);
		this.factory = RgmFactory.eINSTANCE;
	}

	@Override
	public void body(Element body) {
		Element wrapper = body.element("div"); //$NON-NLS-1$
		IntStream.range(0, wrapper.nodeCount()) //
				.mapToObj(wrapper::node) //
				.filter(Element.class::isInstance) //
				.map(Element.class::cast) //
				.filter(new IsDiv()) //
				.forEach(this::resolveParagraph);
	}

	private void resolveParagraph(Element node) {
		Optional<Paragraph> found = findParagraph(node);
		if (found.isPresent()) {
			readPoints(found.get(), node);
			node.elements("div").stream() // //$NON-NLS-1$
					.filter(new NullClass()) //
					.forEach(this::resolveParagraph);
		}
	}

	private Optional<Paragraph> findParagraph(Element node) {
		return context.parts() //
				.find(node.attributeValue("id")) //$NON-NLS-1$
				.filter(Paragraph.class::isInstance) //
				.map(Paragraph.class::cast);
	}

	private void readPoints(Paragraph paragraph, Element node) {
		node.elements().stream() //
				.filter(new IsDiv()) //
				.filter(new OfClass("para")) //$NON-NLS-1$
				.forEach(e -> appendPoint(paragraph, e));
	}

	private void appendPoint(Paragraph paragraph, Element node) {
		Point point = factory.createPoint();
		point.setId(subParagraphId(node));
		point.setName(subParagraphName(node));
		point.getText().addAll(collectText(node));
		point.getReferences().addAll(references(node));
		paragraph.getParts().add(point);
	}

	// TODO: NF: provide a more meaningful way to collect subparagraph's text
	private List<StyledLine> collectText(Element node) {
		return node.elements("p").stream() //$NON-NLS-1$
				.map(Element::content) //
				.map(this::collectParagraph) //
				.map(this::styledLine).collect(Collectors.toList()); // $NON-NLS-1$
	}

	private List<StyledNode> collectParagraph(List<Node> nodes) {
		return nodes.stream().map(this::styledNode).collect(Collectors.toList());
	}

	private StyledLine styledLine(List<StyledNode> nodes) {
		StyledLine styled = factory.createStyledLine();
		styled.getText().addAll(nodes);
		return styled;
	}

	private StyledNode styledNode(Node node) {
		StyledNode styled = factory.createStyledNode();
		styled.setText(node.getText());
		styled.setType(Optional.ofNullable(node.getName()).orElse("")); //$NON-NLS-1$
		return styled;
	}

	private List<Part> references(Element node) {
		return node.elements("p").stream() //$NON-NLS-1$
				.flatMap(i -> i.elements("a").stream()) //$NON-NLS-1$
				.map(a -> a.attributeValue("href")) //$NON-NLS-1$
				.map(new PickId(context)) //
				.map(context.parts()::find) //
				.filter(Optional::isPresent) //
				.map(Optional::get) //
				.collect(Collectors.toList());
	}

	private String subParagraphId(Element node) {
		return node.attributeValue("id"); //$NON-NLS-1$
	}

	private String subParagraphName(Element node) {
		return node.elements("div").stream() //$NON-NLS-1$
				.filter(new OfClass("marginalizedparent")) //$NON-NLS-1$
				.map(e -> e.element("a")) //$NON-NLS-1$
				.map(Element::getText) //
				.findAny().orElse(""); //$NON-NLS-1$
	}

}