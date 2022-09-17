package stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ahmet", "Türk", 19));
        people.add(new Person("Ayşe", "Türk", 20));
        people.add(new Person("John", "Amrican", 15));
        people.add(new Person("Smith", "Amrican", 14));
        people.add(new Person("Smith", "Amrican", 16));
        people.add(new Person("George", "Amrican", 39));
        System.out.println(getKidsName(people));
        System.out.println(getKidsName2(people));
    }

    public static Set<String> getKidsName(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18)
                kids.add(person.getName());
        }
        return kids;
    }
    public static Set<String> getKidsName2(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toSet());
    }
}
