package adil.java.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] s, String[] q) {
        int j;
        int count;
        int res[]=new int[q.length];
        for(int i=0;i<q.length;i++){
        	count=0;
        	j=0;
            while(j<s.length){
                if(s[j]==q[i]){
                count++;
               }
            j++;
            }
            res[i]=count;
        }
        return res;
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
    	String strings[]= {"def","de","fgh","de"};
    	String queries[]= {"de","lmn","fgh","rc"};

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {

           System.out.println(res[i]);
        }
        
    }
}
