// calculate the interest of three years 

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class third{
    
    public static void main (String []args){

    int balance =1000,interest=50;
    char d = '$';
    int interest1_sum= balance + interest * 3;

        System.out.println(" \t Welcome Dear User ");
        System.out.print("\n");
        System.out.println("   current balance is : " + balance + d);

        System.out.println("the interest for per year is '%5' = " + interest + d);

        System.out.println("the balace after 3 years of '%5' interest =" + interest1_sum + d);

    }
}
