package com.mindtree.ttg.assessment.mock.question4;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Finds a given word in the jumbled alphabets. 
 * Below is the logical set of steps involved in playing the game and write a program that would automate this game.
 * Word Search. 
 * Search for a character pattern (word) in a 2-dimensional array.
 * a)	Array will be N*N. (N is in between 2 and 9) 
 * b)	Word would not contain any spaces.
 * c)	Word can be discovered in any of the four ways – forward, backward, up and down.
 * d)	The search is case-insensitive. 
 * e)	A word if at all found will occur only once in the maze.
 * 
 * @author TTG
 *
 */
public class WordPuzzle {

	/**
	 * Finds if a word is present in the given maze and if the word is found, 
	 * it returns the word and the coordinates of the first letter of the word.
	 * 
	 * @param maze, a two dimensional Character array
	 * @param words, a list of String containing words that need to be searched
	 * @return List of String - if the given word is found in the given matrix, 
	 * the output contains the word which is followed up by its first letter coordinate and so on. 
	 * The first letter coordinate of the word found in the matrix is arrived as per the rule 
	 * - If a word is found in the matrix, say, ‘THE’, 
	 * & the first letter of the word is found in 1st row and 5th column (while moving forward),
	 *  the coordinates are 15. If a word is not found, it doesn’t appear in the output.
	 */
	public List<String> findWords (Character[][] maze, List<String> words) {
		
		List<String> expected = new ArrayList<String> ();
//		expected.add("THE");
//		expected.add("15");
//		expected.add("CONTEST");
//		expected.add("68");
		return expected;
	}
}
