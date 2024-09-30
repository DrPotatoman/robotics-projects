package nestedtriangle;

public class nesteddiamond {

    public static void main(String args[]){
        topHalf();
        bottomHalf();
    }

    //now we make the top of the diamond

    static void topHalf(){
        int t = 0;
        
        while (t<9) {

            int s = 9;
            int r = 0;
            System.out.println();

            while (s>t+1) {
                
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

    //now we make the bottom of the diamond
    static void bottomHalf(){
    
        int d = 8;

        while (d>0) {

            int e = 0;
            int w = 17;
            System.out.println();

            while (e<9-d) {

                System.out.print(" ");
                e++;
                
            }

            while (w>18-2*d) {

                System.out.print("*");
                w--;
                
            }
        d--;
        }
    }
}