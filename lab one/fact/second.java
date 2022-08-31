//calculat the factorial fo numbers form 1 to 10

import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;
public class second {
    
    public static void main (String []args){


    int fact=1 ,i;
    int a=1;

    System.out.print("enter a numer :");
    Scanner num = new Scanner(System.in);
    int n = num.nextInt();

    for ( i=1; i<=n; i ++)
    {
        fact = fact * i;
    }



    do{


    System.out.print(a + " * ");
    a++;

    }while(a<=n);

    System.out.print(" = "+ fact);
    
num.close();
    }
}
