package com.mindtree.ttg.assessment.question2;

import java.util.List;

/**
 * Question 2 (Item Category) The purpose of this class is to fetch the details
 * of categories and their corresponding item details.
 * 
 * Please refer the DB Script provided to create the table and populate it with
 * sample records.
 * 
 * @author TTG
 * 
 */

public class ItemCategory {

	/**
	 * 
	 * Fetches the category-wise total item count and item-wise count where
	 * count is more than 5 from the database tables.
	 * 
	 * @return a list of String where each item in the list contains the records
	 *         in the following order The information should be returned in the
	 *         following order. First row contains the category name which
	 *         contains the maximum number of items. If two categories contain
	 *         the same number of item count, the category names are ordered
	 *         alphabetically. Next row contains the total item count for the
	 *         above category. Next row contains the item name in the category
	 *         which has the maximum count greater than 5. If two items have
	 *         same count, the item names are ordered alphabetically. Next row
	 *         contains the item count for the above item name. And so on…
	 */
	public List<String> getCategoryItemCount() {
		
		return null;
	}

}
