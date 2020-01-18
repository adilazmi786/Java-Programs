package adil.java.code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TwoString {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        boolean isCheck=false;
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map1.containsKey(s1.charAt(i)))
            map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
            else{
                map1.put(s1.charAt(i),1); 
            }
        }
        int i=0;
        while(i<s2.length()) {
        	 if(map1.containsKey(s2.charAt(i)) && map1.get(s2.charAt(i))>=1)
                 isCheck=true;
        	 i++;
        }
       
        if(isCheck)
        return "YES";
        else
        return "NO";
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
 

            String s1 = "hello";

            String s2 = "world";

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }

    
}
