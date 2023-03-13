import java.util.*;

public class array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 91;
        // marks[1] = 89;
        // marks[2] = 45;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for (int i = 0; i <= i; i++) {
        //     System.out.println(marks[i]);
        // }
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        //input
        for(int i=0;i<=size;i++){
             number[i]=sc.nextInt();
        }
        for(int i=0;i<=size;i++){
            System.out.println(number[i]);
        }

    }

}
