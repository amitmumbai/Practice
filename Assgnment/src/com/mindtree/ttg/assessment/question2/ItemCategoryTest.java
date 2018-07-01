package com.mindtree.ttg.assessment.question2;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

public class ItemCategoryTest extends TestCase {
	
	@Test
	public void testGetCategoryItemCountOne() {
		List<String> expected = new ArrayList<String> ();
		expected.add("DVD");
		expected.add("50");
		expected.add("2012 a love story");
		expected.add("25");
		expected.add("Amar Prem");
		expected.add("10");
		expected.add("Shutter Island");
		expected.add("10");
		expected.add("Book");
		expected.add("45");
		expected.add("C# and Net Framework");
		expected.add("20");
		expected.add("Dork");
		expected.add("10");
		expected.add("Java Certification");
		expected.add("10");
		expected.add("Electronics");
		expected.add("15");
		expected.add("Mobile");
		expected.add("10");
		
		ItemCategory object = new ItemCategory ();
		List<String> actual = object.getCategoryItemCount();
		assertEquals(expected, actual);
	}
	
	//TBD
//	public void testGetCategoryItemCountTwo() {
//		
//	}

}
