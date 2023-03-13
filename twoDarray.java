import java.util.*;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int[][] numbers = new int[row][colm];
        for (int i = -0; i <= row; i++) {
            for (int j = 0; j <= colm; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= colm; j++) {
                System.out.print(numbers[i][j] + "");
            }
            System.out.println();
        }
    }

}
