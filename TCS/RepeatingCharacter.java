package TCS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingCharacter {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.hasNextLine() ? sc.nextLine().trim() : "";

        if (s == null || s.length() == 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // preserve insertion order so we can find "first" occurrences
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // first non-repeating character (count == 1)
        Character firstNon = null;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) { firstNon = e.getKey(); break; }
        }

        // find highest frequency
        int maxFreq = 0;
        for (int v : map.values()) if (v > maxFreq) maxFreq = v;

        // pick the first character (by order) that has the highest frequency
        Character mostRepeated = null;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == maxFreq) { mostRepeated = e.getKey(); break; }
        }

        if (firstNon != null) {
            // print first non-repeating, then the most repeated character
            System.out.println(firstNon + " " + mostRepeated);
        } else {
            // all characters are repeating -> print None and the first repeating character
            Character firstRepeating = null;
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() > 1) { firstRepeating = e.getKey(); break; }
            }
            if (firstRepeating != null)
                System.out.println("None " + firstRepeating);
            else
                System.out.println("None");
        }

        sc.close();
    }
}
