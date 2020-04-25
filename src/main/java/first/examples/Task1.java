package first.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines");
        int countString = Integer.parseInt(reader.readLine());
        String shortString = null;
        String longString = null;

        for (int i = 0; i < countString; i++) {
            System.out.println("line number " + (i + 1));
            String currentString = reader.readLine();
            if (shortString == null || currentString.length() <= shortString.length()) {
                shortString = currentString;
            }
            if (longString == null || currentString.length() >= longString.length()) {
                longString = currentString;
            }
        }

        assert shortString != null;
        System.out.println("shortest line: (" + shortString.length() + "): " + shortString);
        System.out.println("longest line: (" + longString.length() + "): " + longString);
    }
}
