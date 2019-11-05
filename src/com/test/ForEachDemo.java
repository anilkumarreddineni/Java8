package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo
{
	
	/**
	 * Create a map using Stream Filter where key is the fruit name and value is the count.
	 */
	private static void createMap() {
		List<String> fruitList = new ArrayList<String>();
		Map<String, Integer> fruitMap = new HashMap<String, Integer>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Apple");
		fruitList.add("Guava");
		fruitList.add("Guava");
		fruitList.forEach(fruit -> {
			if (fruitMap.get(fruit) == null) {
				fruitMap.put(fruit, 1);
			} else {
				fruitMap.put(fruit, fruitMap.get(fruit) + 1);
			}
		});
		System.out.println("FruitMap is "+fruitMap);
	}
	
	private static void useForEach() {
		List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        
        /**
         * Anonymous Implementation.
         */
        /*names.forEach(new Consumer<String>(){

            @Override
            public void accept(String t)
            {
                System.out.println(t.charAt(0));
                
            }
         });
*/      
        /**
         * Normal Implementation
         */
//        names.forEach(new MyConsumer());
        
        /**
         * Using Lambda(name less function(left(parameter) right(code inside a method)) as the Collection is a functional interface.
         */
         // names.forEach(fruit->System.out.println(fruit.charAt(0)));
          
          /**
           * Filter the above same logic using Streams
           */
          names.stream().filter(fruit->fruit.length()==5).forEach(fruit->System.out.println(fruit));;
	}
	
	
	
    public static void main(String[] args)
    {
            createMap();
    }

}
