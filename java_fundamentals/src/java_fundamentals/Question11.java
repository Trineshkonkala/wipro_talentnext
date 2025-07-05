package java_fundamentals;

public class Question11 {

	public static void main(String[] args) {
		char ch = 'a';
		if (Character.isLowerCase(ch)) {
			char upper = Character.toUpperCase(ch);
			System.out.println(ch + "->" + upper);
		} else if (Character.isUpperCase(ch)) {
			char lower = Character.toLowerCase(ch);
			System.out.println(ch + "->" + lower);
		} else {
			System.out.println("Please enter an alphabet character.");
		}

	}

}