package com.mindtree.ttg.assessment.mock.question2;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BookAuthorTest {

	@Test
	public void testGetAuthorsOne() {
		List<String> expected = new ArrayList<String>();
		expected.add("G. P. F. Lane");
		expected.add("Alternative Forages for Ruminants");
		expected.add("Lockhart & Wisemans Crop Husbandry");
		expected.add("Michael Brett");
		expected.add("Roses & Thorns");
		expected.add("The Berbers");
		expected.add("P.G. Nagle");
		expected.add("Glorieta Pass");
		expected.add("Red River");
		
		BookAuthor object = new BookAuthor();
		List<String> actual = object.getAuthors();
		assertEquals(expected, actual);
	}
}
