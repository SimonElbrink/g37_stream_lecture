package se.lexicon.simon;

import se.lexicon.simon.model.Gender;
import se.lexicon.simon.model.Person;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Examples {


    public Optional<String> getFirstPerson (Collection<String> string){
        return string.stream()
                .min((name1, name2) -> name1.compareTo(name2));
    }

    public Optional<Person> getYoungestPerson(Collection<Person> people){
       return people.stream()
                .min((p1,p2) -> p1.getAge() - p2.getAge());
    }

    public Optional<Person> getOldestPerson(Collection<Person> people){
       return people.stream()
                .max(Comparator.comparingInt(Person::getAge));
    }

    public long countElementInStream(Collection<Person> people){
       return people.stream()
                .count();
    }

    public void printoutPeople(Collection<Person> people){
//        people.stream().forEach(person -> System.out.println(person));
        people.stream().forEach(System.out::println);
    }

    public List<Person> filterFemalesAndReturnList(Collection<Person> people) {
        return people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
    }

    public void filterFemalesAndAgeAbove17AndPrintOut(Collection<Person> people) {
        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .filter(person -> person.getAge() >= 18)
//                .forEach(person -> System.out.println(person));
                .forEach(System.out::println);

    }


}
