package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ahmet", "Türk", 19));
        people.add(new Person("Ayşe", "Türk", 20));
        people.add(new Person("John", "Amrican", 21));
        people.add(new Person("Smith", "Amrican", 14));
        people.add(new Person("George", "Amrican", 39));
        System.out.println(getOldestPerson(people));
        System.out.println(getOldestPerson2(people));
    }

        public static Person getOldestPerson (List <Person> people){
            Person oldestPerson = new Person("","",0);
            for (Person person: people){
                if (person.getAge()> oldestPerson.getAge()){
                    oldestPerson = person;
                }
            }
            return oldestPerson;
        }
    public static Person getOldestPerson2 (List <Person> people){
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }
}



