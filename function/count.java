package function;

public class count {

    public static void main(String args[]){ 

       System.out.println( counter(5));
    
    }
    
    static int counter(int n){

        int q = 0;
    
        while (n>0) {

            q = q + n;
            n = n - 1;
        }

        return q;

    }
}
    