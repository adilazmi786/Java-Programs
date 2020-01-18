package adil.java.code;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum=0;
        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<6-2;i++){
            for(int j=0;j<6-2;j++){
            	sum=0;
              sum=sum+arr[i][j]+arr[i][j+1]+arr[i][j+2];
              sum=sum+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            //  arr[i][j]=sum;
              if(sum>max)
              max=sum;
            }
        }
    return max;
    }

    public static void main(String[] args) throws IOException {

        int[][] arr = {{1,1,1 ,0, 0, 0},
        		{0, 1, 0, 0, 0, 0},
        		{1, 1, 1, 0, 0, 0},
        		{0, 0, 2, 4, 4, 0},
        		{0, 0, 0, 2, 0, 0},
        		{0, 0, 1, 2, 4, 0}};

       

        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
