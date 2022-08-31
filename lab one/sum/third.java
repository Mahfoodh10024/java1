// calculate the sum of numbers form 1 to 10

import java.util.Scanner;

public class third {
    
    public static void main (String []args){


    int sum=0 ,i;
    int a=1;

    System.out.print("enter a numer :");
    Scanner num = new Scanner(System.in);
    int n = num.nextInt();

    for ( i=1; i<=n; i ++)
    {
        sum = sum + i;
    }



    do{


    System.out.print(a + " + ");
    a++;

    }while(a<=n);

    System.out.print(" = "+ sum);
    
num.close();
    }
}
