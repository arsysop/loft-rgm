package ru.arsysop.loft.rgm.cxxdraft.tests.cxx14;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ru.arsysop.loft.rgm.model.api.TocChapter;

public final class ConceptsIntegrityTest extends Cxx14IntegrityTest {

	private final TocChapter basicConcepts = document.getToc().getChapters().get(4);

	@Test
	public void name() {
		assertEquals("Basic concepts", basicConcepts.getName()); //$NON-NLS-1$
	}

	@Test
	public void count() {
		int subchapters = 11;
		assertEquals(subchapters, basicConcepts.getChapters().size()); // $NON-NLS-1$
		for (int i = 0; i < subchapters; i++) {
			TocChapter chapter = basicConcepts.getChapters().get(i);
			assertEquals(chapter(3, i + 1), chapter.getNumber());
			assertNotNull(chapter.getName());
			assertNotNull(chapter.getPart());
		}
	}

	@Test
	public void scope() {
		int paragraphs = 10;
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = basicConcepts.getChapters().get(2).getChapters().get(i);
			assertEquals(paragraph(3, 3, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void lookup() {
		int paragraphs = 6;
		assertEquals(paragraphs, basicConcepts.getChapters().get(3).getChapters().size());
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = basicConcepts.getChapters().get(3).getChapters().get(i);
			assertEquals(paragraph(3, 4, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void qualifiedLookup() {
		int paragraphs = 2;
		assertEquals(paragraphs, basicConcepts.getChapters().get(3).getChapters().get(2).getChapters().size());
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = basicConcepts.getChapters().get(3).getChapters().get(2).getChapters().get(i);
			assertEquals(subparagraph(3, 4, 3, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void startAndTermination() {
		int paragraphs = 3;
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = basicConcepts.getChapters().get(5).getChapters().get(i);
			assertEquals(paragraph(3, 6, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void storageDuration() {
		int paragraphs = 5;
		assertEquals(paragraphs, basicConcepts.getChapters().get(6).getChapters().size());
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = basicConcepts.getChapters().get(6).getChapters().get(i);
			assertEquals(paragraph(3, 7, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void dynamicDuration() {
		int paragraphs = 3;
		assertEquals(paragraphs, basicConcepts.getChapters().get(6).getChapters().get(3).getChapters().size());
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = basicConcepts.getChapters().get(6).getChapters().get(3).getChapters().get(i);
			assertEquals(subparagraph(3, 7, 4, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

	@Test
	public void types() {
		int paragraphs = 3;
		for (int i = 0; i < paragraphs; i++) {
			TocChapter paragraph = basicConcepts.getChapters().get(8).getChapters().get(i);
			assertEquals(paragraph(3, 9, i + 1), paragraph.getNumber());
			assertNotNull(paragraph.getName());
			assertNotNull(paragraph.getPart());
		}
	}

}
