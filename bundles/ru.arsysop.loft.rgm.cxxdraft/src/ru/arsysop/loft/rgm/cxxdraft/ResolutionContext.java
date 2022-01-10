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
package ru.arsysop.loft.rgm.cxxdraft;

import org.dom4j.Node;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.model.api.Document;
import ru.arsysop.loft.rgm.model.api.IndexEntry;
import ru.arsysop.loft.rgm.model.api.Part;

public interface ResolutionContext {

	Document document();

	String location(EObject container);

	ContentResolution<Part> parts();

	ContentResolution<IndexEntry> indexEntries();

	void warning(Node node, String message);

	Diagnostic diagnostic();
}
