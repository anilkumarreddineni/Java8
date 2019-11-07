package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * forEachRemaing is used to implement a particalar logic for each and every element in the Collection.
 * It accepts a Consumer
 * Advantage:Instead of iterating overing the collection and the applying the logic to the elements with out changing the structure
 * of the Collection we can simply use this.
 * @author anilkumar.r
 *
 */
public class IteratorForEachRemainingDemo {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Guava");
        Iterator iterator=fruits.listIterator();
        iterator.forEachRemaining(fruit->System.out.println(fruit+" is a fruit"));
	}

}
