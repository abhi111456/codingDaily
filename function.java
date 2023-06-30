import java.util.*;

// public class function {
//     public static void PrintName(String name) {
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         PrintName(name);

//     }

// }
public class function {
    public static int PrintSum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = PrintSum(a, b);
        System.out.println(sum);

    }

}
