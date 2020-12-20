package adil.java.code;

import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,0,3,12};
		moveZeroes(a);
	}

	public static void moveZeroes(int[] nums) {
		 int k=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=0){
	                nums[k++]=nums[i];
	            }
	        }
	        while(k<nums.length){
	         nums[k++]=0;
	        }
	       Arrays.stream(nums).forEach(System.out::print);
	}
}
