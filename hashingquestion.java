import java.util.*;
//Distinct element

public class hashingquestion {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("A");
        letters.add("A");
        letters.add("A");

        letters.add("B");
        letters.add("B");
        letters.add("B");

        letters.add("C");
        letters.add("C");

        Set<String> distinctSet = new HashSet<>(letters);

        System.out.println("Number of unique values: " + distinctSet.size());

    }

}
