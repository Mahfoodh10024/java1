// program to calculate the Perimeter & Area of rectangle

import java.util.Scanner;
public class Main {


    public static void main (String []args){


        System.out.println("enter the length of the rectangle :");

        Scanner l =new Scanner(System.in);
        double L = l.nextDouble();


        System.out.println("enter the width of the rectangle :");

        Scanner w =new Scanner(System.in);
        double W = w.nextDouble();


        double Area = W * L ;
        double Perimeter =  2 * Area;

        System.out.println("the Area of the circle is = " + Area);
        System.out.println("the perimeter of the circle is = " + Perimeter);

    }
}
