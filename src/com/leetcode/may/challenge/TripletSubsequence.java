package com.leetcode.may.challenge;

public class TripletSubsequence {

	public static void main(String[] args) {
		int nums[] = {2,1,5,0,4,6};
		boolean is = increasingTriplet(nums);
		System.out.println(is);
	}

	public static boolean increasingTriplet(int[] nums) {

        for(int i=0;i<nums.length - 2;) {
           if(nums[i] < nums[i+1]) { 
               if(nums[i+1] < nums[i+2]) {
                   return true;
               }
               i = i+2;
            } else {
               i = i+1;
            }
        }
        return false;
	}
}
