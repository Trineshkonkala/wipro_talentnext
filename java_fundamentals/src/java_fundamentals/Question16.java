package java_fundamentals;

import java.util.Scanner;

public class Qestion16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");

        sc.close();
    }
}
