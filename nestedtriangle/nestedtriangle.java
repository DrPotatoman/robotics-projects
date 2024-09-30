package nestedtriangle;

public class nestedtriangle {
    public static void main(String args[]){
        int t = 0;
        
        while (t<9) {

            int s = 9;
            int r = 0;
            System.out.println();

            while (s>t) {
                
                System.out.print(" ");
                s--;
            }

            while (r<2*t+1) {

                System.out.print("*");
                r ++;
            }
        t ++;
        }
    }
}