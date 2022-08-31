//program to find square & cube & fourth power
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("enter a number :");
        int n1 =num.nextInt();                      //user will enter a number

           int pow = n1 * n1;              // pow = number * by it self
           int cube= n1 * n1 * n1;         // cube = number * number * number

        System.out.println( "the power = " + pow  + "\n" + "the cube = " + cube);

        System.out.println("the fourth power =" + Math.pow(n1,4)); //Math package for fourth power

    }
}