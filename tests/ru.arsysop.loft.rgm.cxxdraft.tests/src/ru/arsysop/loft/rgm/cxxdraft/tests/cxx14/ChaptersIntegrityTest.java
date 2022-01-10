package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.arsysop.loft.rgm.model.api.TocChapter;

@SuppressWarnings("nls")
public final class ChaptersIntegrityTest extends Cxx14IntegrityTest {

	@Test
	public void testChapters() {
		EList<TocChapter> chapters = document.getToc().getChapters();
		int visualizations = 2;
		int numbered = 30;
		int annexes = 5;
		int indexes = 3;
		int size = visualizations + numbered + annexes + indexes;
		assertEquals(size, chapters.size());
		for (int i = visualizations; i < visualizations + numbered; i++) {
			TocChapter chapter = chapters.get(i);
			assertEquals(String.valueOf(i - 1), chapter.getNumber());
		}
		for (int i = visualizations + numbered; i < visualizations + numbered + annexes; i++) {
			TocChapter chapter = chapters.get(i);
			String number = chapter.getNumber();
			assertTrue(number.startsWith("Annex"));
		}
		for (int i = size - indexes; i < size; i++) {
			TocChapter chapter = chapters.get(i);
			String name = chapter.getName().toLowerCase();
			assertTrue(name.contains("index"));
		}
	}

}