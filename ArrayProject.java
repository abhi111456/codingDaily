import java.util.*;

class ArrayProject {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("how many days temperatrure");
        int numdays = Sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= numdays; i++) {
            System.out.println("how " + i + "s temperature");
            int next = Sc.nextInt();
            sum += next;

        }
        double average = sum / numdays;
        System.out.println();
        System.out.println("average=" + average);
    }
}