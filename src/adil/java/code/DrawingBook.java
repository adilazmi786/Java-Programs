package adil.java.code;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
    	int i=1;
        int count=0,mid=0,t=0;
        if(n%2==0)
        {
             t=n;

        }
        else
        {
             t=n-1;

        }
    	mid=n/2;

         if(n==p)
           return 0;
        if(mid>=p){
        while(i<p){
            i=i+2;
            count++;
        }
        }else{
           while(t>p){
            t=t-2;
            count++;
        }
        }
        return count;
    }


    public static void main(String[] args) {


        int result = pageCount(7, 4);
        System.out.println(result);
    }
}
