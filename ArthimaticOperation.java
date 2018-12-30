// '//' is used to make single line comments.......

import java.util.Scanner;
class ArthimaticOperation 
{
	public static void main(String[] args) 
	{
         Scanner take=new Scanner(System.in);//Object creation done......
		 
		 //Taking two value to do the operation......
		 System.out.println("Please Give two Input value to do Arthimatic Operation : ");
		   float fst=take.nextFloat();//nextInt() is method to take integer value using object of Scanner class 'take'. 
	       float scand=take.nextFloat();
		 
      
	     //now time to do all operation and print all one by one.............

		 System.out.println("Additon of given two number is: "+(fst+scand));// '+' operator for addition
		 System.out.println("Subtraction of given two number is: "+(fst-scand));// '-' operator for subtraction.
		 System.out.println("Multiplication of given two number is: "+(fst*scand));// '*' operator for multipication.
		 System.out.println("Division of given two number is: "+(fst/scand));// '/' operator for dividion.
	}
}
