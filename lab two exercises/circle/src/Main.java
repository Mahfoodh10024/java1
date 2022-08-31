// program to calculate the Perimeter & Area of circle

import java.util.Scanner;
public class Main {


    public static void main (String []args){

        Scanner S =new Scanner(System.in);

        System.out.println("enter a value :");

        double P1=3.14;

      double s = S.nextDouble();

      double Area = P1 * s * s;
      double Perimeter = P1 * s;

        System.out.println("the Area of the circle is = " + Area);
        System.out.println("the perimeter of the circle is = " + Perimeter);

    }
}
