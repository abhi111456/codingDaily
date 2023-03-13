import java.util.*;

import javax.sound.midi.Soundbank;

public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(10);
        s.add(15);
        s.add(20);
        System.out.println(s);

        if (s.contains(20)) {
            System.out.println("present");
        } else {
            System.out.println("Not present");
        }
        s.remove(15);
        System.out.println(s.isEmpty());
        System.out.println(s.size());

    }

}
