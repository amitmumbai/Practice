package com.mindtree.ttg.assessment.mock.question2;

import java.util.List;


/**
 * The purpose of this class is to fetch the details of authors and 
 * their corresponding book details.
 * 
 * Please refer the DB Script provided to create the table and populate it
 * with sample records.
 * 
 * @author TTG
 *
 */
public class BookAuthor {

	/**
	 * This method fetches only those author names and their books
	 * from the database tables who has written at least two books.
	 * 
	 * @return 
	 * those Author and their books from the tables who has written at least two books. The information will be returned in the following order.
	 * 		Author name which comes first in alphabetical order will appear first
	 * 		Author name is followed up by book name which the above author has written. The book name will be in the alphabetical order & so on.
	 */
	public List<String> getAuthors (){
		
		return null;
	}
}
