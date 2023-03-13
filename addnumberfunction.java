import java.util.Scanner;

public class addnumberfunction {
    public static int caclulateSum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = caclulateSum(a, b);
        System.out.println(sum);

    }

}
