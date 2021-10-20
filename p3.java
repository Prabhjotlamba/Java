import java.io.*;
import java.lang.*;
import java.util.* ;
class swapTwoNumberClass{
    
    public static void fun(int a, int b)
    {
        System.out.println("Previous Values ->" + "a ->" + a + " b->"+b);
        int temp = a ; 
        a = b ; 
        b = temp ; 
        
        System.out.println("New Values ->" + "a ->" + a + " b->" + b);
        return  ;
    }
	public static void main (String[] args) {
	    
	    Scanner scn = new Scanner(System.in) ;
	    
	    int a , b ;
	    a = scn.nextInt();
	    b = scn.nextInt();
	    fun(a , b);
	    
	   // System.out.println( fun(a , b) );
	}
}
