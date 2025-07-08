package java_fundamentals;

public class Question27 {
	public static void main(String[] args) {
		int[] numbers = { 45, 12, 89, 33, 5, 67 };
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
