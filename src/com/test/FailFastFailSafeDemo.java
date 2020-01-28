package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * if we use for each loop and remove an element inside the loop system throws ConcurrentModificationException and
 * the same is thrown  * when we use iterator and the element is removed using collection reference.this i throw
 * if the iterator provided in the implementation is  * a fail fast iterator.Fail safe iterator do not throw any exception
 * even though structure is modified as they work on the clone  * of the collection instead of the direct collection.
 * Example of Fail Safe iterator is the iterator provide in the CopyOnWriteArrayList \
 * Note:CopyOnWriteArrayList is in java.util.concurrent package and was introduced in Java 1.5.
 * @author anilkumar.r
 *
 */
public class FailFastFailSafeDemo {

	private static void failFast() {
		List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Guava");
        Iterator iterator=fruits.iterator();
        while(iterator.hasNext()) {
        	fruits.remove("Apple");
        	iterator.next();
        	}
	}
	
	private static void failSafe() {
		CopyOnWriteArrayList<String> fruits = new CopyOnWriteArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Guava");
        Iterator iterator=fruits.iterator();
        while(iterator.hasNext()) {
            	fruits.remove("Apple");
            	iterator.next();
        	}
        System.out.println(fruits);
	}
	public static void main(String[] args) {
		failSafe();

	}

}
