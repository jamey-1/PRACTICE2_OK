package org.comit;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class App4 {
	
	public static void main(String[] args) {
		
//		26 - Make a program that asks for the salary of N workers 
//		(first, you must ask how many workers there are) 
//		and print the one with the highest salary.
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("How many workers there are?");
		 * 
		 * int numOfWorkers = input.nextInt();
		 * 
		 * double[] salaryArr = new double[numOfWorkers];
		 * 
		 * for (int i = 0; i < numOfWorkers; i++) { System.out.println("Worker " + i +
		 * " salary is: "); salaryArr[i] = input.nextDouble(); }
		 * 
		 * Arrays.sort(salaryArr);
		 * 
		 * System.out.println("The highest salary is: " + salaryArr[numOfWorkers -1]);
		 * 
		 * input.close();
		 */
		 
		  
//		27 - Write an algorithm that calls another, and the call prints a value.
		
		/*
		 * int number = 5, result; result = factorial(number); System.out.println(number
		 * + " factorial = " + result);
		 */
        
//        28 - Write an algorithm that calls another name "add", 
//        which receives 2 numbers. 
//        The summation algorithm must add its parameters. 
//        The algorithm you invoke must receive that value 
//        and display it on the screen.
        
		/* callAdd(); */
		
//		29 - Write an algorithm and a sub-algorithm. 
//		Write two variables with the same name 
//		and the compiler does not show an error.
		
		/*
		 * for(int i = 0; i < 10; i++) {
		 * 
		 * }
		 * 
		 * for(int i = 0; i < 5; i++) {
		 * 
		 * }
		 */
		
//		30 - Write a program that asks for a numerical password 
//		and allows three attempts. If the user enters the correct password, 
//		it shows "Correct!" And run any program, 
//		after the message. Otherwise, 
//		the program should display "Wrong password". 
//		Then finish the program immediately.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Initiate a numerical password: ");
		
		int pwd = input.nextInt();
		
		boolean isCorrect = false;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter your password: ");
			int tempPwd = input.nextInt();
			
			if (pwd == tempPwd) {
				isCorrect = true;
				break;
			}
			
		}
		
		if (isCorrect) {
			System.out.println("Password correct, you can run any program from here! ");
		} else {
			System.out.println("Wrong password.");
		}
		
		input.close();
		
	}
	
	static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static void callAdd() {
		int a = 1;
		int b = 2;
		System.out.println(add(a, b));
	}
	

}
