package com.test;

import java.util.ArrayList;
import java.util.List;
/**
 * removeIf is a feature in java 8 which accepts a predicated and removes the element which matches the predicate.
 * Advantages:we need not iterate the collecation and add the elements to a new collection which does not match(as
 * we cannot change the structure of collection(Fail fast)).
 * How can we remove the element from a Collection.
 * @author anilkumar.r
 *
 */
public class CollectionRemoveIfDemo {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.removeIf(fruit->fruit.charAt(1)=='p');
        System.out.println(fruits);
        
	}

}
