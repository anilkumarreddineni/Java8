package com.practice.hackerRank;

public class RepetedString {

	static long findCount(String s,int n) {
		 long totalCount=0;
         long aCount=0;
         /**
          * Find the count of the 'a' in the given String.
          */
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='a'){
                 aCount++;
             }
         }
         /**
          * Find the divisor and count
          */
         totalCount=(n/s.length())*aCount;
         /**
          * Find the remainder and the count of a in the remainder
          */
         long remainder=n%s.length();
         for(int i=0;i<remainder;i++){
             if(s.charAt(i)=='a'){
                 totalCount++;
             }
         }
         return totalCount;
	        
	}
	public static void main(String[] args) {
	System.out.println(findCount("aba",10));

	}

}
