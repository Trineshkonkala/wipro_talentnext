package java_fundamentals;

public class Question30 {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};
        printArray(withoutTen(arr1));  
        printArray(withoutTen(arr2));  
        printArray(withoutTen(arr3));  
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index++] = num; 
            }
        }

        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
