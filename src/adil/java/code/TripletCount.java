package adil.java.code;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TripletCount {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        int count=0,k=0;
        String temp="";
        long tripletCount=0;int j=1;
        long n=0;
       // HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();){
        	
            if(i>=1 && arr.get(i)==arr.get(i-1)) {
                n=(long)Math.pow(r,i-1);

            }else {
                n=(long)Math.pow(r,i);
            }
            long re=(arr.get(i));
            if(n==re)
            count++;
            if(count==3){
                tripletCount++;
                count=0;
                i=j;
                j++;
            }else
            i++;
           
        }
        return tripletCount;
    }

    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());*/
    	List<Long> arr=new ArrayList<Long>();
    	arr.add(1L);
    	arr.add(5L);
    	arr.add(5L);
    	arr.add(25L);
    	arr.add(125L);

    	int r=5;
        long ans = countTriplets(arr, r);
        System.out.println(ans);
/*
        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
