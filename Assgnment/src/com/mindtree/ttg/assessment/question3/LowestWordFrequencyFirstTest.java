package com.mindtree.ttg.assessment.question3;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

public class LowestWordFrequencyFirstTest extends TestCase {

	@Test
	public void testGetWordFrequencyOne() {
		List<String> expected = new ArrayList<String>();
		expected.add("2");
		expected.add("TEST");
		expected.add("THE");
		expected.add("THIS");
		expected.add("3");
		expected.add("IS");

		LowestWordFrequencyFirst object = new LowestWordFrequencyFirst();
		String sentence = "Hello this is test. The test is successful. But, this is not the end.";
		List<String> actual = object.getWordFrequency(sentence);

		assertEquals(expected, actual);
	}

}
