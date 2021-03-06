/**
 * Copyright (c) 2021 ArSysOp
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
package ru.arsysop.loft.rgm.spec.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.arsysop.loft.rgm.spec.model.api.*;

import ru.arsysop.loft.rgm.spec.model.meta.SpecPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.loft.rgm.spec.model.meta.SpecPackage
 * @generated
 */
public class SpecAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpecPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpecPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecSwitch<Adapter> modelSwitch =
		new SpecSwitch<Adapter>() {
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseIndexEntry(IndexEntry object) {
				return createIndexEntryAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePointContent(PointContent object) {
				return createPointContentAdapter();
			}
			@Override
			public Adapter casePointItem(PointItem object) {
				return createPointItemAdapter();
			}
			@Override
			public Adapter casePointText(PointText object) {
				return createPointTextAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseSectionContent(SectionContent object) {
				return createSectionContentAdapter();
			}
			@Override
			public Adapter caseSynopsis(Synopsis object) {
				return createSynopsisAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseToc(Toc object) {
				return createTocAdapter();
			}
			@Override
			public Adapter caseTocChapter(TocChapter object) {
				return createTocChapterAdapter();
			}
			@Override
			public Adapter caseWithReferences(WithReferences object) {
				return createWithReferencesAdapter();
			}
			@Override
			public Adapter caseWithTocChapters(WithTocChapters object) {
				return createWithTocChaptersAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.WithTocChapters <em>With Toc Chapters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.WithTocChapters
	 * @generated
	 */
	public Adapter createWithTocChaptersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Toc <em>Toc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Toc
	 * @generated
	 */
	public Adapter createTocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.TocChapter <em>Toc Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TocChapter
	 * @generated
	 */
	public Adapter createTocChapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.PointContent <em>Point Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.PointContent
	 * @generated
	 */
	public Adapter createPointContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.PointItem <em>Point Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.PointItem
	 * @generated
	 */
	public Adapter createPointItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.PointText <em>Point Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.PointText
	 * @generated
	 */
	public Adapter createPointTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.SectionContent <em>Section Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.SectionContent
	 * @generated
	 */
	public Adapter createSectionContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.IndexEntry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.IndexEntry
	 * @generated
	 */
	public Adapter createIndexEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Synopsis <em>Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Synopsis
	 * @generated
	 */
	public Adapter createSynopsisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.arsysop.loft.rgm.spec.model.api.WithReferences <em>With References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.arsysop.loft.rgm.spec.model.api.WithReferences
	 * @generated
	 */
	public Adapter createWithReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpecAdapterFactory
