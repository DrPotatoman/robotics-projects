package tempconverter;

import java.util.Scanner;

class tempconverter{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the tempature in farenheit?");
        if(scanner.hasNextDouble()){   

            Double fork = scanner.nextDouble();
            double cork =(fork - 32) * 5/9;
            System.out.println("It is " + cork + " degrees celsius");
        }

        else{
            System.out.println("that's not a tempature, try again");
        }
        
        scanner.close();
    }
}