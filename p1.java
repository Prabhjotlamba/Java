import java.io.*;
import java.lang.*;
import java.util.* ;
class AdditionClass {
    
    public static int fun(int a, int b)
    {
        return a + b ;
    }
	public static void main (String[] args) {
	    
	    Scanner scn = new Scanner(System.in) ;
	    
	    int a , b ;
	    a = scn.nextInt();
	    b = scn.nextInt();
	    
	    System.out.println( fun(a , b) );
	}
}
