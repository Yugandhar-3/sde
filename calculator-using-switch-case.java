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
		
// 		System.out.println("give two numbers and a operator");

		double a1=sc.nextDouble();
		double a2=sc.nextDouble();
		char ch=sc.next().charAt(0);
		double result=0;
		switch(ch)
		{
		    case '+':
		        result=a1+a2;
		        System.out.println(result);
		        break;
		    case '-':
		        result=a1-a2;
		        System.out.println(result);
		        break;
		    case '*':
		        result=a1*a2;
		        System.out.println(result);
		        break;
		    case '/':
		        result=a1/a2;
		        System.out.println(result);
		        break;
		    default:
		        System.out.println("Invalid operator");
		        
		}
		
	}
}
