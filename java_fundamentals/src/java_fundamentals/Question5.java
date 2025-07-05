package java_fundamentals;

import java.util.Scanner;

import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean result = LastDigitsSame(num1, num2);
		System.out.println(result);
	}
	static boolean LastDigitsSame(int num1, int num2) {
		return (num1 % 10) == (num2 % 10); 
	}

}
