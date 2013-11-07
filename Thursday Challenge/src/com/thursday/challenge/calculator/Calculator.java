package com.thursday.challenge.calculator;


/**
 * The Class Calculator.
 * 
 * Thursday challenge 
 * 
 * Given a limited instruction set, would you be able to create a calculator? Write methods 
 * that implement the - (minus), * (multiply) and / (divide) functions using only the + operator
 * @see http://java.dzone.com/articles/thursday-code-puzzler-14
 * 
 * @author martin
 */
public class Calculator {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int number1 = Integer.valueOf(args[0]);
		String op = args[1];
		int number2 = Integer.valueOf(args[2]);
		int result=0;
		if(op.equals("-")) {
			result = minus(number1,number2);
		} else if (op.equals("*")) {
			result= multiply(number1,number2);
		}else {
			result = divide(number1,number2);
		}
		System.out.println("Result:"+result);
	}

	/**
	 * Divide.
	 *
	 * @param number1 the first number which is bigger
	 * @param number2 the second number which is smaller
	 * @return the int
	 */
	private static int divide(int number1, int number2) {
		int answer = 0;
		int i = 0;
		int result = 0;
		while(number1>result){
			i++;
			result=multiply(i, number2);
		}
		answer=i;
		return answer;
	}

	/**
	 * Multiply.
	 *
	 * @param number1 the first number 
	 * @param number2 the second number 
	 * @return the int
	 */
	private static int multiply(int number1, int number2) {
		int answer=0;
		for(int i = 1;i<=number1;i++){
			answer += number2;
		}
		return answer;
	}

	/**
	 * Minus.
	 *
	 * @param number1 the first number which is bigger
	 * @param number2 the second number which is smaller
	 * @return the int
	 */
	private static int minus(int number1, int number2) {
		int answer =0;
		int i = 0;

			while(number2 != number1){
				number2++;
				i++;
			}
		answer=i;
		return answer;
	}

}
