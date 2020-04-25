package first.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines");

        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input data:");

        String[] array = new String[count];

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextLine();
        }

        Arrays.sort(array, (String line1, String line2) -> {
            if (line1.length() == (line2.length())) {
                return line1.compareTo(line2);
            }
            return Integer.compare(line1.length(), line2.length());
        });

        for (int i = 0; i < count; i++) {
            System.out.println("Output data:");
            System.out.println("(" + array[i].length() + "): " + array[i]);
        }
    }
}
