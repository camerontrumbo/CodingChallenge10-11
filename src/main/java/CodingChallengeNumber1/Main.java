package CodingChallengeNumber1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        iterateHashMap();
    }

    public static void iterateHashMap() {
        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(1, "Pizza");
        h1.put(2, "Hamburger");
        h1.put(3, "Hot dogs");
        h1.put(4, "Pie");

        for (Map.Entry<Integer, String> m : h1.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
