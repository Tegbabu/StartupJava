/**
 * 
 */
package com.dventus.app;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author user
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Method to sort the names with the new java 8 version
	 * @param names
	 */
	public static void sortNames(List<String> names)
	{
		Collections.sort(names, (n1,n2)-> n1.compareTo(n2));
	}
	/**
	 * Method to sort names with the java 7 version
	 * @param names
	 */
	public static void sortNamesOld(List<String> names)
	{
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String n1, String n2) {
				// TODO Auto-generated method stub
				return n1.compareTo(n2);
			}
			
		});
	}

}
