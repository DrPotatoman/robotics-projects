import java.util.Scanner;
class helloworld{
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("what is my purpose");
        int markercount = 2;
        System.out.println(markercount);
        markercount = markercount + 87;
        System.out.println(markercount);
        //Now we will take create a Scanner objact to take user input
        Scanner scanner = new Scanner(System.in);
        
        int newMarkers = scanner.nextInt();
        markercount = markercount + newMarkers;
        System.out.println("You have " + markercount + " markers");
        scanner.close()
    }
}