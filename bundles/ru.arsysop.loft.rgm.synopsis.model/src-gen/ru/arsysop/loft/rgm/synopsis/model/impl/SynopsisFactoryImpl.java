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
package ru.arsysop.loft.rgm.synopsis.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.arsysop.loft.rgm.synopsis.model.api.*;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisFactory;
import ru.arsysop.loft.rgm.synopsis.model.meta.SynopsisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynopsisFactoryImpl extends EFactoryImpl implements SynopsisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SynopsisFactory init() {
		try {
			SynopsisFactory theSynopsisFactory = (SynopsisFactory)EPackage.Registry.INSTANCE.getEFactory(SynopsisPackage.eNS_URI);
			if (theSynopsisFactory != null) {
				return theSynopsisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SynopsisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynopsisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SynopsisPackage.HEADER_SYNOPSIS: return createHeaderSynopsis();
			case SynopsisPackage.NAMESPACE_SYNOPSIS: return createNamespaceSynopsis();
			case SynopsisPackage.CLASS_TEMPLATE_SYNOPSIS: return createClassTemplateSynopsis();
			case SynopsisPackage.FUNCTION_TEMPLATE: return createFunctionTemplate();
			case SynopsisPackage.TEMPLATE_TYPE_PARAMETER: return createTemplateTypeParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderSynopsis createHeaderSynopsis() {
		HeaderSynopsisImpl headerSynopsis = new HeaderSynopsisImpl();
		return headerSynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespaceSynopsis createNamespaceSynopsis() {
		NamespaceSynopsisImpl namespaceSynopsis = new NamespaceSynopsisImpl();
		return namespaceSynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassTemplateSynopsis createClassTemplateSynopsis() {
		ClassTemplateSynopsisImpl classTemplateSynopsis = new ClassTemplateSynopsisImpl();
		return classTemplateSynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionTemplate createFunctionTemplate() {
		FunctionTemplateImpl functionTemplate = new FunctionTemplateImpl();
		return functionTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateTypeParameter createTemplateTypeParameter() {
		TemplateTypeParameterImpl templateTypeParameter = new TemplateTypeParameterImpl();
		return templateTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynopsisPackage getSynopsisPackage() {
		return (SynopsisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SynopsisPackage getPackage() {
		return SynopsisPackage.eINSTANCE;
	}

} //synopsisFactoryImpl
