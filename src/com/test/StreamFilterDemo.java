package com.test;

import java.util.ArrayList;
import java.util.List;

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
        List<String> newFruitList=new ArrayList<String>();
        names.stream().filter(fruit->fruit.length()==5).forEach(fruit->newFruitList.add(fruit));
        System.out.println("Fruits which have the five Chracters is "+newFruitList);
	}

    public static void main(String[] args)
    {
    	filterFruits();
    
    }

}
