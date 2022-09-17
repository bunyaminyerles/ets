package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ahmet", "Türk", 19));
        people.add(new Person("Ayşe", "Türk", 20));
        people.add(new Person("John", "Amrican", 21));
        System.out.println(namesToString(people));
        System.out.println(namesToString2(people));
        System.out.println(namesToString3(people));
    }

    public static String namesToString(List<Person> people) {
        String label = "Names : ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length())
                sb.append(",");
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString2(List<Person> people) {
        return "Names : " +
                people.stream()
                        .map(Person::getName)
                        .reduce((i, sum) -> i + "," + sum)
                        .orElse("") + ".";
    }

    public static String namesToString3(List<Person> people) {
        return "Names : " +
                people.stream()
                        .map(Person::getName)
                        .collect(Collectors.joining(",")) + ".";
    }
}



