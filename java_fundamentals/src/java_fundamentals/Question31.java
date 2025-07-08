package java_fundamentals;

public class Question31 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = evenOdd(arr);
        System.out.print("Rearranged array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex] = nums[i];
                evenIndex++;
            } else {
                result[oddIndex] = nums[i];
                oddIndex--;
            }
        }

        return result;
    }
}
