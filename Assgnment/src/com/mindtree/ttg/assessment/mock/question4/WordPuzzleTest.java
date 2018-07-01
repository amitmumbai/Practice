package com.mindtree.ttg.assessment.mock.question4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordPuzzleTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindWords() {
		Character[][] maze = new Character [][] {
				{'H','A', 'F', 'B', 'T', 'H','E','W'}, 
				{'J','B', 'S', 'Y', 'O', 'Y','J','S'},
				{'L','G', 'B', 'E', 'S', 'T','Y','U'},
				{'T','S', 'C', 'O', 'L', 'T','E','D'},
				{'J','T', 'F', 'S', 'D', 'O','W','L'},
				{'W','T', 'S', 'E', 'T', 'N','O','C'},
				};
		
		List<String> words = new ArrayList<String>();
		words.add("THE");
		words.add("CONTEST");
		words.add("TAJMAHALTEA");
		
		WordPuzzle puzzle = new WordPuzzle();	
		List<String> actual = puzzle.findWords(maze, words);
		List<String> expected = new ArrayList<String> ();
		expected.add("THE");
		expected.add("15");
		expected.add("CONTEST");
		expected.add("68");
		
		assertEquals(expected, actual);
	}

}
