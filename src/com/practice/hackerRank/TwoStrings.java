package com.practice.hackerRank;

public class TwoStrings {
	
	   static boolean find(String s1,String s2) {
		   /**
		    * This logic can be used to find is there are to substrings common in between the 
		    * given Strings.
		    */
		    String alphabets="abcdefghijklmnopqrstuvwxyz";
		    int i=0;
		    while(i<26) {
		    	if(s1.indexOf(alphabets.charAt(i))>0&&s2.indexOf(alphabets.charAt(i))>0) {
		    		return true;
		    	}
		    	i++;
		    }
		    return false;
	   }
		public static void main(String args[]) {
			System.out.println(find("abc","9fr"));
		}
}
