package java_fundamentals;

public class Question25 {
    public static void main(String[] args) {
        int[] asciiValues = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100}; 
        System.out.print("Corresponding characters: ");
        for (int i = 0; i < asciiValues.length; i++) {
            System.out.print((char) asciiValues[i]);
        }

        System.out.println();
    }
}
