package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LetterCount {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLetterOfNamesThanFive("A","b","c","abcdef"));
    }

    public static int getTotalNumberOfLetterOfNamesThanFive(String... names){
        return Arrays.stream(names)
                .filter(name->name.length()>5)
                .mapToInt(String::length)
                .sum();
    }
}
