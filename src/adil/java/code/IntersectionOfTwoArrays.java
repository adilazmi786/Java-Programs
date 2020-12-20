package adil.java.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {4,9,5};
		int nums2[]= {9,4,9,8,4};
		System.out.println(intersect(nums1,nums2));
		
	}
	 public static int[] intersect(int[] nums1, int[] nums2) {
	        
	       int l1=nums1.length;
	       int l2=nums2.length;
	        List<Integer> res=new ArrayList<>();
	        int i=0;int j=0;
	        while(i<l1 && j<l2){
	            if(nums1[i]>nums2[j]){
	                j++;
	            }else{
	                if(nums1[i]<nums2[j]){
	                    i++;
	                }else{
	                    res.add(nums1[i]);
	                    i++;
	                    j++;
	                }
	            }
	        }
	        System.out.println(res);

	        return res.stream().mapToInt(Number::intValue).toArray();
	        
	    }

}
