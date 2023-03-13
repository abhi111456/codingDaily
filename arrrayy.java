
    //take an array  as input from user .search for a given number  x and the print the index at usser occurs
    import java.util.*;

    public class arrrayy {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int number[] = new int[size];
            for (int i = 0; i <= size; i++) {
                number[i] = sc.nextInt();

            }
            int x = sc.nextInt();
            for (int i = 0; i <= size; i++) {
                if (number[i] == x) {
                    System.out.println("x found at index" + i);

                }

            }

        }
    }