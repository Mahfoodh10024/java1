//program with some String formats
public class Main {

    public static void main(String[] args) {

       String s = "Hello" ;
       String t = "World" ;
                            //Hello length        world length         drop Hello letters             &    drop Hello letters                 print 'Hello world''world Hello'
        System.out.println( s.length() + "\n " +  t.length() + "\n" + s.substring(1,2) + "\n" + s.substring(s.length() / 2 ,s.length()) + "\n" + s + t + "\n"  + t + s);

    }
}