package com.test;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterDemo
{

    public static void main(String[] args)
    {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");        
          
          /**
           * Filter the List and Fetches the Strings that have the length 5.
           */
          names.stream().filter(fruit->fruit.length()==5).forEach(fruit->System.out.println(fruit));;
          
    
    }

}
