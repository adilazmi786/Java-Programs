package adil.java.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
            int count=1;
            int max=arr.get(0);
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<arr.size();i++) {
            	if(map.containsKey(arr.get(i))) {
            		map.replace(arr.get(i), map.get(arr.get(i))+1);
            	}else {
            		map.put(arr.get(i), count);
            	}
            }
          
           int ans=0;
           for(Integer i:map.keySet()) {
        	   int n=map.get(i);
        	   if(n>max) {
        		   max=n;
       		   	ans=i;

        	   }
           }
            /*int comp[]=new int[256];
            for(int i=0;i<arr.size();i++){
                comp[arr.get(i)]++;
            }
            for(int i=0;i<comp.length;i++){
                if(comp[i]>max)
                max=comp[i];
            }*/
            return ans;
    }

    public static void main(String[] args) {
      
    	List<Integer> arr=new ArrayList<>(Arrays.asList(1,4,4,4,5,3));
        int result = migratoryBirds(arr);
        System.out.println(result);
    }
}
