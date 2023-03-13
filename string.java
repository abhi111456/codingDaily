import java.util.*;

public class string {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your name is" + name);
        // String sentence = "tonystarx";
        // String name = sentence.substring(0, 4);
        // System.out.println(name);
        StringBuilder db = new StringBuilder("BBHHISHEK");
        System.out.println(db.charAt(0));
        db.setCharAt(0, 'A');
        System.out.println(db);
        db.insert(0, 's');
        System.out.println(db);
    }

}
