package com.test;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo
{

    public static void main(String[] args)
    {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");        
        /**
         * Using Lambda(name less function(left(parameter) right(code inside a method)) as the Collection is a functional interface.
         */
         // names.forEach(fruit->System.out.println(fruit.charAt(0)));
          
          /**
           * Filter the above same logic using Streams
           */
          names.stream().filter(fruit->fruit.length()==5).forEach(fruit->System.out.println(fruit));;
          
    
    }

}
