/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<0)
	    {
	       System.out.println("Invalid Input");
	    }
	    else if(n>=0 && n<=18)
	    {
	        System.out.println("Age is less than 18");
	    }
	    else
	    {
	        System.out.println("Age is greater than 18");
	    }
	}
}
