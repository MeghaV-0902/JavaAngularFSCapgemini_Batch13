package imperitive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Person> people = List.of(
        new Person("John",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE),
                new Person("Alex",Gender.MALE),
                new Person("Alice",Gender.FEMALE)
        );
        System.out.println("Imperative");
        List<Person> females = new ArrayList<>();
        for(Person person : people)
        {
            if(Gender.FEMALE.equals(person.gender))
                females.add(person);
        }
        List<Person> males = new ArrayList<>();
        for(Person person : people)
        {
            if(Gender.MALE.equals(person.gender))
                males.add(person);
        }
        for (Person p:females)
        System.out.println(p);
        System.out.println("Declarative");
        List<Person> females2 = people.stream()
                .filter(p -> p.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);


    }
    static class Person
    {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }
    enum Gender {
        MALE,
        FEMALE
    }
}
