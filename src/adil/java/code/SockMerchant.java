package adil.java.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int noOfSocks=0;
       boolean visited[]=new boolean[n];
       for(int i=0;i<n;i++){
           visited[i]=false;
       }

       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(ar[i]==ar[j] && visited[i]==false && visited[j]==false)
            {
            	noOfSocks++;
            	visited[i]=true;
            	visited[j]=true;
            }
        }
       }
        return noOfSocks;
    }


    public static void main(String[] args) throws IOException {
      /*  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }*/
    	int ar[]= {10,20,20,10,10,30,50,10,20};
        int result = sockMerchant(ar.length, ar);
        System.out.println(result);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}
