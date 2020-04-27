package first.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of words per line:");
        int count = Integer.parseInt(reader.readLine());
        String[] array = reader.readLine().trim().split(" ");
        String minWord = "";
        int minLetters = 0;
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < count; i++) {
            letters.clear();
            for (int j = 0; j < array[i].length(); j++) {
                if (letters.containsKey(array[i].charAt(j))) {
                    letters.put(array[i].charAt(j), letters.get(array[i].charAt(j) + 1));
                } else {
                    letters.put(array[i].charAt(j), 1);
                }
            }

            if (letters.size() < minLetters || minLetters == 0) {
                minLetters = letters.size();
                minWord = array[i];
            }

        }

        System.out.println("Shortest word: " + minWord);
    }
}
