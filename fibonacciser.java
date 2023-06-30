import java.util.*;

public class fibonacciser {
    // recusive function
    public static void fibonacciseries(int a, int b, int n) {
        // recursive call
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacciseries(b, c, n - 1);

    }

    // main function
    public static void main(String[] args) {
        // value initialize a,b,n;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 15;
        fibonacciseries(a, b, n - 2);

    }

}
