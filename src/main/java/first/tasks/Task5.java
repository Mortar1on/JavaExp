package first.tasks;

import java.util.*;

public class Task5 {

    private static final Set<Character> AGREEABLE = new HashSet<>(Arrays.asList('B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P',
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'));
    private static final Set<Character> VOWEL = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProcessingWords = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> words = new LinkedHashSet<>();

        for (int i = 0; i < countProcessingWords; i++) {
            words.add(scanner.next());
        }

        int result = solve(words);

        System.out.println(result);
    }

     static int solve(LinkedHashSet<String> words) {
        int result = 0;
        for (String word : words) {
            int vowels = 0;
            int agreeables = 0;
            boolean onlyLatin = true;
            for (Character c : word.toCharArray()) {
                if (VOWEL.contains(c)) {
                    vowels++;
                } else if (AGREEABLE.contains(c)) {
                    agreeables++;
                } else {
                    onlyLatin = false;
                }
            }
            if (onlyLatin && vowels == agreeables) {
                result++;
            }
        }
        return result;
    }
}
