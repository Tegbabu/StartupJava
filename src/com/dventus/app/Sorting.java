/**
 * 
 */
package com.dventus.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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
		
		List<String> names = new ArrayList<String>();
		
	    System.out.println("Insert list of names..\n");
		Scanner sc = new Scanner(System.in);
		String name;
		
		for(int i=0;i<10;i++)
		{
			name = sc.next();
			
			names.add(name);
		}
		
		System.out.println("\nBefore Sorting the names...");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		sortNames(names);
		
		System.out.println("\nAfter Sorting the names...");
			
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
		}
		
		System.out.println("\nSearch for the name in the list...");
		
		String search = sc.next();
		
	    System.out.println("Search Results: " + searchName(names, search));
		
		
		

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
	
	public static String searchName(List<String> names, String key)
	{
		String searchresult = "";
		for(int i = 0; i<names.size();i++)
		{
			if(key.equals(names.get(i)))
			{
				searchresult = names.get(i);
			}
			
		}
		
		return searchresult;
	}

}
