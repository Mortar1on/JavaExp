package first.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    /**
     * Ввести N строк с консоли.
     * Найти среди них самую короткую и самую длинную.
     * Вывести найденные строки и их длину.
     * Если строк, удовлетворяющих условию, более одной - вывести последнюю из них.
     *
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество доступных для чтения строк
     * Строка_1
     * Строка_2
     * ...
     * Строка_N
     *
     * Формат выходных данных:
     * MIN ($длина_минимальной_строки$): $минимальная_строка$
     * MAX ($длина_максимальной_строки$): $максимальная_строка$
     *
     * -----------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 4
     * Унылая пора! Очей очарованье!
     * Приятна мне твоя прощальная краса —
     * Люблю я пышное природы увяданье,
     * В багрец и в золото одетые леса,
     *
     * Выходные данные:
     * MIN (29): Унылая пора! Очей очарованье!
     * MAX (35): Приятна мне твоя прощальная краса —
     */


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lines");
        int countString = Integer.parseInt(reader.readLine());
        String mixLength = null;
        String maxLength = null;

        for (int i = 0; i < countString; i++) {
            System.out.println("line number " + (i + 1));
            String currentString = reader.readLine();
            if (mixLength == null || currentString.length() <= mixLength.length()) {
                mixLength = currentString;
            }
            if (maxLength == null || currentString.length() >= maxLength.length()) {
                maxLength = currentString;
            }
        }

        assert mixLength != null;
        System.out.println("shortest line: (" + mixLength.length() + "): " + mixLength);
        System.out.println("longest line: (" + maxLength.length() + "): " + maxLength);
    }
}
