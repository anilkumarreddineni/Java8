package com.test;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterDemo
{
	
	/**
	 * Filter the Fruits which have the fruit name length is 5.
	 */
	private static void filterFruits() {
		List<String> names = new ArrayList<String>();
        names.add("Apple");
        names.add("Banana");
        names.add("Grapes");
        names.add("Strawberry");
        names.add("Guava");
        names.add("Guava");
        System.out.println(names.stream().collect(Collectors.toSet()));
	}

    public static void main(String[] args)
    {
    	filterFruits();
    
    }

}
