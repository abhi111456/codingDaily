import java.util.*;

public class bitMask {
    public static void main(String[] args) {

        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("number is zero");
        } else {
        }
        System.out.println("numbber is one");
    }

}
