package adil.java.code;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DesignerPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int mul=1;
        word=word.toLowerCase();
        for(int i=0;i<word.length();i++){
            mul*=h[word.charAt(i)-'a'];
        }
    return mul;
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
    	int h[]= {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
    	String word="zaba";
        int result = designerPdfViewer(h, word);
        System.out.println(result);
    }
}
