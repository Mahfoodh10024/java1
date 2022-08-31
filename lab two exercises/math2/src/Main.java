//program to calculate (sum & average & difference & product & distance & maximum & minimum
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("enter a number :");
        int n1 =num.nextInt();                  //user input of first nubmer

        System.out.println("enter a number :");
        int n2 =num.nextInt();                 // user input fo second number

        int sum = n1 + n2;  // sum = first number + second number
            int difference = ( n1 - n2) * -1; // difference = first number - second number 
                int product = n1 * n2 ;      // product = first number * second number
                    double avg = (n1 + n2 ) / 2; // average = first number + second number / 2
                           int distance = difference * -1; // distance = first number - second number

        System.out.println("the sum is = " + sum + "\n" + "the difference is = " + difference + "\n" + "the product is =" + product + "\n" + "the average is =" + avg + "%" + "\n" + "the distance is =" + distance);

            if (n1 > n2){
                System.out.println("the maximum is = " + n1);
                                                              // expressions to print maximum & minmum
                System.out.println("the minimum is = " + n2);
            }
            else{
                System.out.println("the maximum is = " + n2);
                System.out.println("the minimum is = " + n1);
            }

    }
}