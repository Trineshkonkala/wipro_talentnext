package java_fundamentals;

import java.util.Arrays;

public class Question26 {
    public static void main(String[] args) {
        int[] numbers = {23, 89, 12, 4, 56, 99, 1, 45};
        Arrays.sort(numbers);
        int smallest1 = numbers[0];
        int smallest2 = numbers[1];
        int largest1 = numbers[numbers.length - 1];
        int largest2 = numbers[numbers.length - 2];
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
    }
}
