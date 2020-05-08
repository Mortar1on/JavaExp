package first.tasks;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    /**
     * Ввести N строк с консоли.
     * Упорядочить и вывести строки в порядке возрастания значений их длины.
     * В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке.
     * <p>
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество доступных для чтения строк
     * Строка_1
     * Строка_2
     * ...
     * Строка_N
     * <p>
     * Формат выходных данных:
     * В результате выполнения в выходной поток должны быть выведены N строк следующего вида:
     * (длина строки): строка наименьшей длины
     * (длина строки): строка большей длины
     * (длина строки): строка большей длины
     * ...
     * (длина строки): строка наибольшей длины
     * <p>
     * ----------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     * <p>
     * Входные данные:
     * 4
     * Тихо струится река серебристая
     * В царстве вечернем зеленой весны.
     * Солнце садится за горы лесистые.
     * Рог золотой выплывает луны.
     * <p>
     * Выходные данные:
     * (27): Рог золотой выплывает луны.
     * (30): Тихо струится река серебристая
     * (32): Солнце садится за горы лесистые.
     * (33): В царстве вечернем зеленой весны.
     */

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of lines:");

        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input data:");

        String[] array = new String[count];

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextLine();
        }

        Arrays.sort(array, Task2::compare);

        for (int i = 0; i < count; i++) {
            System.out.println("Output data:");
            System.out.println("(" + array[i].length() + "): " + array[i]);
        }
    }

    private static int compare(@NotNull String o1, @NotNull String o2) {
        if (o1.length() == o2.length()) {
            return o1.compareTo(o2);
        }
        return Integer.compare(o1.length(), o2.length());
    }
}
