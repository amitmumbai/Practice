package com.mindtree.ttg.assessment.mock.question3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HighestWordFrequencyFirstTest {

	@Test
	public void testGetWordFrequencyOne() {
		List<String> expected = new ArrayList<String>();
		expected.add("3");
		expected.add("IS");
		expected.add("2");
		expected.add("TEST");
		expected.add("THE");
		expected.add("THIS");
		
		HighestWordFrequencyFirst object = new HighestWordFrequencyFirst();
		String sentence = "Hello this is test. The test is successful. But, this is not the end.";
		List<String> actual = object.getWordFrequency(sentence);
		
		assertEquals(expected, actual);
	}

}
