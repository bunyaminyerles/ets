package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println(mapToUpperCase("ahmet","Ali","bünyamin"));
        System.out.println(mapToUpperCase2("ahmet","Ali","bünyamin"));
    }

    public static Collection<String> mapToUpperCase (String... names){
        Collection <String> uppercaseNames = new ArrayList<>();
        for (String name: names){
            uppercaseNames.add(name.toUpperCase(Locale.ROOT));
        }
        return uppercaseNames;
    }

    public static Collection<String> mapToUpperCase2 (String... names){
        return Arrays.stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
