package adil.java.code;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountRemovedCharacterToMakeAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {


        int n1=a.length();
        int n2=b.length();

        int count=0;
        int hmap1[]=new int[26];
        int hmap2[]=new int[26];

        for(int i=0;i<26;i++)
            hmap1[i]=0;
         for(int i=0;i<26;i++)
            hmap2[i]=0;
            
        for(int i=0;i<n1;i++){
            hmap1[a.charAt(i)-'a']++;
        }
        
        for(int i=0;i<n2;i++){
            hmap2[b.charAt(i)-'a']--;
        }
        for(Integer i:hmap2) {
        	count+=Math.abs(i);
        }
        /*for(int i=0;i<26;i++){
            if(hmap1[i]!=hmap2[i])
            System.out.println(hmap1[i]+" "+hmap2[i]+"=>"+count++);
            else
                System.out.println(hmap1[i]+" "+hmap2[i]);

        }*/
        
        return count;
    }


    public static void main(String[] args) throws IOException {
       
    	String a="fcrxzwscanmligyxyvym";
    	String b="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int res = makeAnagram(a, b);
        System.out.println(res);
    }
}

