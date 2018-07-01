package com.mindtree.ttg.assessment.question4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BlockLengthTest {

	@Test
	public void testArrangeBlockLengthsOne() {
		Character[][] matrix = new Character[][] {
				{ 'A', 'E', 'I', 'O', 'U', 'Y', 'C' },
				{ 'D', 'D', 'O', 'O', 'R', 'A', 'Q' },
				{ 'D', 'Z', 'Z', 'Z', 'Z', 'B', 'W' },
				{ 'D', 'A', 'N', 'G', 'X', 'C', 'Y' },
				{ 'Z', 'X', 'N', 'X', 'F', 'D', 'Z' }};

		
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(2);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		
		BlockLength object = new BlockLength();
		List<Integer> actual = object.arrangeBlockLengths(matrix);
		
		assertEquals(expected, actual);
	}

}
