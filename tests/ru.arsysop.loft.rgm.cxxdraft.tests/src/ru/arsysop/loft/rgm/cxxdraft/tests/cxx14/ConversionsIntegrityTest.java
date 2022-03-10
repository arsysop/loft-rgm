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

public final class ConversionsIntegrityTest extends Cxx14IntegrityTest {
	
	private final TocChapter standartConversions = document.getToc().getChapters().get(5);

	@Test
	public void name() {
		assertEquals("Standard conversions", standartConversions.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 13;
		assertEquals(subchapters, standartConversions.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = standartConversions.getChapters().get(i);
			assertEquals(chapter(4, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

}
