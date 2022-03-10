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
package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.spec.model.api.TocChapter;

public final class ExpressionsIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter expressions = document.getToc().getChapters().get(6);

	@Test
	public void name() {
		assertEquals("Expressions", expressions.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 19;
		assertEquals(subchapters, expressions.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = expressions.getChapters().get(i);
			assertEquals(chapter(5, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public void primary() {
		int paragraphs = 2;
		assertEquals("Primary expressions", expressions.getChapters().get(0).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = expressions.getChapters().get(0).getChapters().get(i);
			assertEquals(paragraph(5, 1, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void postfix() {
		int paragraphs = 11;
		assertEquals("Postfix expressions", expressions.getChapters().get(1).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = expressions.getChapters().get(1).getChapters().get(i);
			assertEquals(paragraph(5, 2, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void unary() {
		int paragraphs = 7;
		assertEquals("Unary expressions", expressions.getChapters().get(2).getName()); //$NON-NLS-1$
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = expressions.getChapters().get(2).getChapters().get(i);
			assertEquals(paragraph(5, 3, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
