import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subArrayofA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = 0, count = 0;
        for (int i = 1, k, j; i <= N; i++) {
            for (k = 1; k <= N - i + 1; k++) {
                for (j = 0; j < i; j++) {
                    sum += arr[j + k - 1];
                }
                if (sum < 0)
                    count++;
                sum = 0;
            }
        }
        System.out.print(count);
        sc.close();
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}
