package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(10, 2, 3, 4, 5, 6, 7, 8, 9);

        a.stream()
                .filter(i -> i % 2 == 0)
                .sorted()
                .forEach(i -> System.out.println(i));
    }
}