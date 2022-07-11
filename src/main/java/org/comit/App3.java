package org.comit;

import java.util.Scanner;

@SuppressWarnings("unused")
public class App3 {
	
	public static void main(String[] args) {
//		16 - Write a program in Java that reads an integer from the keyboard 
//		and makes the sum of the next 100 numbers, showing the result on screen.

		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("What number?");
		 * 
		 * int num = input.nextInt();
		 * 
		 * int acc = 0; for (int i = num; i <= num + 100; i++) { acc += i; }
		 * 
		 * System.out.println("The sum is " + acc + "!");
		 * 
		 * input.close();
		 */
		
//		17 - Write a program in Java that converts from Canadian dollars to US dollars. 
//		You will receive a decimal number corresponding to the amount in CAD 
//		and will answer with the corresponding amount in US dollars. Take the quotation of the dollar today.
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("Input a mount of Canadian dollars: ");
		 * 
		 * double canDollars = input.nextDouble();
		 * 
		 * double quotation = 0.78;
		 * 
		 * double usDollars = canDollars * quotation;
		 * 
		 * System.out.println("The US dollars is: " + usDollars);
		 * 
		 * input.close();
		 */
		
//		18 - Write a program in Java that reads two numbers on the keyboard 
//		and says which is the largest and which is the smallest.
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("Input the first number: ");
		 * 
		 * double firstNum = input.nextDouble();
		 * 
		 * System.out.println("Input the second number: ");
		 * 
		 * double secondNum = input.nextDouble();
		 * 
		 * double largestNum; double smallestNum;
		 * 
		 * if (firstNum >= secondNum) { largestNum = firstNum; smallestNum = secondNum;
		 * } else { largestNum = secondNum; smallestNum = firstNum; }
		 * 
		 * System.out.println(largestNum + " is the largest and " + smallestNum +
		 * " is the smallest.");
		 * 
		 * input.close();
		 */
		
//		19 - Write a Java program that does the following: 
//		declare a variable N of type int, a variable A of type double 
//		and a variable C of type char and assign to each one a value. The following screen displays:
//		The value of each variable. The sum of N + A. And A - N
		
		/*
		 * int n = 910; double a = 7.77; char c = 'C';
		 * 
		 * System.out.println("a variable N of type int is: " + n);
		 * System.out.println("a variable N of type int is: " + a);
		 * System.out.println("a variable N of type int is: " + c);
		 * 
		 * System.out.println("The sum of N + A is " + (n + a));
		 * System.out.println("The  N - A is " + (n - a));
		 */
		
//		20 - Write a java program that declares an integer variable B and assigns it a value. 
//		It then displays a message indicating whether the value of B is positive or negative.
//		We will consider 0 as positive.
//		If for example B = 1 the output will be 1 is positive. If for example B = -1 the output will be: -1 is negative.
		
		/*
		 * int B = -1; String sign = B >= 0 ? "positive" : "negative";
		 * 
		 * System.out.println(B + " is " + sign);
		 */
		
//		21 - Make a program in JAVA such that given as data the enrollment 
//		and 5 grades of a student; Print the enrollment, the average and the word "approved" 
//		if the student has an average greater than or equal to 6, 
//		and the word "not approved" otherwise. 
//		Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: 
//		MAT is an integer variable that represents the student's enrollment. 
//		CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.
		
		/*
		 * int MAT = 1; double CAL1 = 7.3; double CAL2 = 5.5; double CAL3 = 6.1; double
		 * CAL4 = 4.5; double CAL5 = 8.6;
		 * 
		 * System.out.println("Enrollment is " + MAT);
		 * 
		 * double average = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5) / 5;
		 * System.out.printf("Average is %f %n", average);
		 * 
		 * if (average >= 6) { System.out.println("approved"); } else {
		 * System.out.println("not approved"); }
		 */
		
//		22 - Make the program in JAVA such that given as a worker's salary, 
//		apply a 15% increase if your salary is less than $ 1000 and 12% otherwise. 
//		Print the new salary of the worker. 
//		Fact: SUE (variable of a real type that represents the salary of the worker).
		
		/*
		 * double salary = 4000;
		 * 
		 * double rate = salary < 1000 ? 1.15 : 1.12;
		 * 
		 * double newSalary = salary * rate;
		 * 
		 * System.out.println("Original salary is: " + salary);
		 * System.out.println("New salary is: " + newSalary);
		 */
		
		
//		23 - Make a program that prints the 10 multiplication tables.
		
		/*
		 * for(int i = 1; i <= 9; i++) { for(int j = 1; j <= i; j++) {
		 * System.out.printf("%d * %d = %d \t", j, i, j * i); } System.out.println(); }
		 */
		
//		24 - Make a calculator.
		
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("Input the first number: "); double first =
		 * input.nextDouble();
		 * 
		 * System.out.println("Input the oprator: "); String operator = input.next();
		 * 
		 * System.out.println("Input the second number: "); double second =
		 * input.nextDouble();
		 * 
		 * double result = 0;
		 * 
		 * switch (operator) { case "+": result = first + second; break; case "-":
		 * result = first - second; break; case "*": result = first * second; break;
		 * case "/": result = first / second; break; default: result = 0; break; }
		 * 
		 * System.out.println("Result is: " + result);
		 * 
		 * input.close();
		 */
		
//		25 - Calculate the salary increase for a group of employees of a company 
//		considering the following criteria: If the salary is less than $ 1,000.00: Increase 15% 
//		If the salary is greater than or equal to $ 1,000.00: Increase 12% 
//		The program must do The following: - Save the new salaries in the arrangement
//		- Calculate the payroll - Print the salaries from the settlement
		
		double[] orgSalaryArr = {
									800.00,
									900.00,
									1000.00,
									1100.00,
									1200.00
								};
		
		double[] newSalaryArr = new double[orgSalaryArr.length];
		
		for (int i = 0; i < orgSalaryArr.length; i++) {
			if (orgSalaryArr[i] < 1000.00) {
				newSalaryArr[i] = orgSalaryArr[i] * 1.15;
			} else {
				newSalaryArr[i] = orgSalaryArr[i] * 1.12;
			}
		}
		
		System.out.println("The original salary array is: ");
		for (double temp : orgSalaryArr) {
			System.out.println(temp);
		}
		
		System.out.println();
		
		System.out.println("The new salary array is: ");
		for (double temp : newSalaryArr) {
			System.out.println(temp);
		}
		
	}

}
