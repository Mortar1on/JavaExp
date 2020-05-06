package first.tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5Test {

    @Test
    @DisplayName("Default test-case")
    void test1() {
        // PREPARE
        LinkedHashSet<String> data = new LinkedHashSet<>(Arrays.asList("Язык", "программирования", "Java", "is", "widespread"));

        // EXECUTE
        int actual = Task5.solve(data);

        // ASSERTIONS
        assertEquals(2, actual);
    }

    @Test
    void test2() {
        // PREPARE
        LinkedHashSet<String> data = new LinkedHashSet<>(Arrays.asList("qwe"));

        // EXECUTE
        int actual = Task5.solve(data);

        // ASSERTIONS
        assertEquals(0, actual);
    }

    @Test
    void test3() {
        // PREPARE
        LinkedHashSet<String> data = new LinkedHashSet<>(Arrays.asList("we"));

        // EXECUTE
        int actual = Task5.solve(data);

        // ASSERTIONS
        assertEquals(1, actual);
    }
}
