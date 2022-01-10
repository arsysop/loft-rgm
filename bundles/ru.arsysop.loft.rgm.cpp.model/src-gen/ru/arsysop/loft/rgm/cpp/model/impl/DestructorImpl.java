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
package ru.arsysop.loft.rgm.cpp.model.impl;

import org.eclipse.emf.ecore.EClass;

import ru.arsysop.loft.rgm.cpp.model.meta.CppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DestructorImpl extends FunctionDeclImpl implements ru.arsysop.loft.rgm.cpp.model.api.Destructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CppPackage.eINSTANCE.getDestructor();
	}

} //DestructorImpl
