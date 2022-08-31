// program to calculate the sum & average of the numbers

import java.util.Scanner;
public class Main {


    public static void main (String []args){


        System.out.println("enter the first number:");
                                                         //user will enter value of the first nubmer
        Scanner fn =new Scanner(System.in);
        int f = fn.nextInt();


        System.out.println("enter the second number :");
                                                         //user will enter value of the second nubmer
        Scanner sn =new Scanner(System.in);
        double s = sn.nextInt();

        System.out.println("enter the third number :");
                                                        //user will enter value of the third nubmer
        Scanner tn =new Scanner(System.in);
        double t = tn.nextInt();

        double sum = f + s  + t; // sum of first number and second number third number
        double avg =  sum  / 3;  //  the three nubmers 'divided by ' thier number

        System.out.println("the sum is = " + sum);   //print sum value
        System.out.println("the average = " + avg); //print average vlaue

    }
}
