package first.tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[count];

        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Output line " + (i + 1) + ":");
            array[i] = scanner.nextLine();
            sum += array[i].length();
        }

        int average = sum/count;
        System.out.println("Average (" + average + ")");

        for (int i = 0; i < count; i++) {
            if (array[i].length() < average) {
                System.out.println("(" + array[i].length() + "): " +array[i]);
            }
        }
    }
}
