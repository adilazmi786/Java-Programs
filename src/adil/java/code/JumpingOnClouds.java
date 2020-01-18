package adil.java.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        
        return getMinJump(c,c.length-1,0,0);
    }
    public static int getMinJump(int c[],int l,int i,int count){
        if(l<=i)
        return count;
        if(i<l && c[i]==0 && (c[i+1]==1))
        {
            count++;
            i=i+2;
        }
        else if(i<l && c[i]==0 && c[i+1]==0)
        {
            i=i+2;
            count++;
        }
        else{
            i=i+1;
            count++;
        }
        return getMinJump(c,l,i,count);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
    	int c[]= {};
        int result = jumpingOnClouds(c);
    }
}
