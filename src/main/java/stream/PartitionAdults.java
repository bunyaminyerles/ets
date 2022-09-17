package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionAdults {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ahmet", "Türk", 19));
        people.add(new Person("Ayşe", "Türk", 20));
        people.add(new Person("John", "Amrican", 21));
        people.add(new Person("Smith", "Amrican", 14));
        people.add(new Person("George", "Amrican", 39));
        System.out.println(partitionAdults(people));
        System.out.println(partitionAdults2(people));
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults2(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() >= 18,Collectors.toList()));
    }
}
