package java_fundamentals;

public class Question33 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};
        
        int[] a2 = {7, 7, 7};
        int[] b2 = {3, 8, 0};
        
        int[] a3 = {5, 2, 9};
        int[] b3 = {1, 4, 5};
        printArray(middleWay(a1, b1)); 
        printArray(middleWay(a2, b2)); 
        printArray(middleWay(a3, b3)); 
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
