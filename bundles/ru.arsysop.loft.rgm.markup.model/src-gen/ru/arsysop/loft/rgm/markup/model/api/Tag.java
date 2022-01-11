/**
 * Copyright (c) 2022 ArSysOp
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 	SPDX-License-Identifier: Apache-2.0
 * Contributors:
 * 	ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.loft.rgm.markup.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.api.Tag#getId <em>Id</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.api.Tag#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link ru.arsysop.loft.rgm.markup.model.api.Tag#getContracts <em>Contracts</em>}</li>
 * </ul>
 *
 * @see ru.arsysop.loft.rgm.markup.model.meta.MarkupPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ru.arsysop.loft.rgm.markup.model.meta.MarkupPackage#getTag_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ru.arsysop.loft.rgm.markup.model.api.Tag#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.markup.model.api.Requirement}.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.markup.model.api.Requirement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see ru.arsysop.loft.rgm.markup.model.meta.MarkupPackage#getTag_Requirements()
	 * @see ru.arsysop.loft.rgm.markup.model.api.Requirement#getTags
	 * @model opposite="tags"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Contracts</b></em>' reference list.
	 * The list contents are of type {@link ru.arsysop.loft.rgm.markup.model.api.Contract}.
	 * It is bidirectional and its opposite is '{@link ru.arsysop.loft.rgm.markup.model.api.Contract#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contracts</em>' reference list.
	 * @see ru.arsysop.loft.rgm.markup.model.meta.MarkupPackage#getTag_Contracts()
	 * @see ru.arsysop.loft.rgm.markup.model.api.Contract#getTags
	 * @model opposite="tags"
	 * @generated
	 */
	EList<Contract> getContracts();

} // Tag