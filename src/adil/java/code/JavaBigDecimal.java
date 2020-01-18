package adil.java.code;

import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        for(int i=0;i<n;i++){
                            
            String a1[]=s[i].split(".");

            for(int j=i+1;j<n-1;j++){
                String a2[]=s[j].split(".");
                 if(a1[0]!=null && a2[0]!=null && !a1[0].equals(a2[0])){
                if(Double.valueOf(s[i])< Double.valueOf((s[j]))){
                   
                        String temp=s[j];
                        s[j]=s[i];
                        s[i]=temp;
                    }
                 
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}