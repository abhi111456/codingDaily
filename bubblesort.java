import java.util.*;

public class bubblesort {
    public static void printBubblesort(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 6, 8 };
        // bubble sort outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            // inner loop
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
        }
        printBubblesort(arr);
    }
}