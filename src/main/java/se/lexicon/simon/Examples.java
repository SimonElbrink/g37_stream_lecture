package se.lexicon.simon;

import se.lexicon.simon.model.Gender;
import se.lexicon.simon.model.Person;
import se.lexicon.simon.model.PersonDTO;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public LocalDate[] getYearOf (int year){
        return Stream.iterate(LocalDate.ofYearDay(year,1), localDate -> localDate.plusDays(1))
                .limit(Year.of(year).isLeap() ? 366 : 365)

                // .toArray with Anonymous inner class
//                .toArray(new IntFunction<LocalDate[]>() {
//                    @Override
//                    public LocalDate[] apply(int value) {
//                        return new LocalDate[value];
//                    }
//                });

                //.toArray with Lambda expression
//                .toArray(value -> new LocalDate[value]);

                // .toArray with Method reference
                .toArray(LocalDate[]::new);
    }

    public Map<Month,List<LocalDate>> getYearInMonths(LocalDate...dates){
       return Stream.of(dates)
                .collect(Collectors.groupingBy(LocalDate::getMonth));

    }


    /**
     * Finding Person by lastname and map to PersonDTO
     * @param people
     * @param lastName
     * @return
     */
    public Collection<PersonDTO> findByLastNameAndConvertToDTO (Collection<Person> people, String lastName){

       return people.stream()
//               .peek(person -> System.out.println("First Of all: " + person))
               .filter(person -> person.getLastName().equalsIgnoreCase(lastName)) // Extracting everyone with lastname of param.
//               .peek(person -> System.out.println("After Filter: " + person))
               .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getLastName()))
//               .peek(personDto -> System.out.println("After Mapping: " + personDto))
               .collect(Collectors.toList());
    }

















}
