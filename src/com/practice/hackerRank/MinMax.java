package com.practice.hackerRank;
import java.util.Scanner;
/**
 * find the min and max sum of four elements in a given array of five elements.
 * @author anilkumar.r
 *
 */
public class MinMax {

    
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
      long min,max,sum;
      min=arr[0];
      max=min;
      sum=min;
        
        for(int i=1;i<arr.length;i++) {
            sum=sum+arr[i];
            if(arr[i]<min) {
            	min=arr[i];
            }
            if(arr[i]>max) {
            	max=arr[i];
            }
        }
   
        System.out.println((sum-max)+" "+(sum-min));
         }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
        	arr[i] = Integer.parseInt(arrItems[i]);
             
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
