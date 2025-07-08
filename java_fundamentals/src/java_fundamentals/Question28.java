package java_fundamentals;

public class Question28 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count++] = arr[i];
            }
        }
        System.out.print("Array after removing duplicates: {");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}
