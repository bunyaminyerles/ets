package stream;

public class Person {

    private String name;
    private String nationality;
    private int age;


    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

}
