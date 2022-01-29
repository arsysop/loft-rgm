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
		return node.elements("p").stream() //$NON-NLS-1$
				.flatMap(i -> i.elements("a").stream()) //$NON-NLS-1$
				.map(a -> a.attributeValue("href")) //$NON-NLS-1$
				.map(new PickId(context)) //
				.map(context.parts()::find) //
				.filter(Optional::isPresent) //
				.map(Optional::get) //
				.collect(Collectors.toList());
	}

}