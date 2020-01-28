package com.practice.hackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * Program to find the number of pairs of socks(same color) in a basket.
 * @author anilkumar.r
 *
 */
public class StockMerchant {
	
	public static int getPairCount(int numberOfSocks,int socksBasket[]) {
		int pairCount=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < numberOfSocks; i++) {
			if (map.containsKey(socksBasket[i])) {
				map.put(socksBasket[i], map.get(socksBasket[i]) + 1);
			} else {
				map.put(socksBasket[i], 1);
			}
		}
		for(Integer i:map.keySet()) {
			pairCount=map.get(i)/2+pairCount;
		}
		return pairCount;
	}

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3};
		System.out.println(getPairCount(4,arr));
	}

}
