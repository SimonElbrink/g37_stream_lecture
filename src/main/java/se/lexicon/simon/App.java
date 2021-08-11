package se.lexicon.simon;

import se.lexicon.simon.model.Gender;
import se.lexicon.simon.model.Person;
import se.lexicon.simon.model.PersonDTO;
import se.lexicon.simon.util.PersonGenerator;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Collection<Person> PEOPLE = PersonGenerator.getInstance().generate(1000);


    public static void main(String[] args)
    {

        Examples examples = new Examples();

//        Stream<Integer> numbers = Stream.of(1,5,10,15,20);
//
//        long amountOfNumbers = numbers.filter(n -> n % 2 == 0).count();
//
//        System.out.println("amountOfNumbers = " + amountOfNumbers);
//
//
//        List<String> names = Arrays.asList("Simon", "Erik", "Ulf");
//        System.out.println(examples.getFirstPerson(names).get());
//
//
//        Long amountOfElementsInPeople = examples.countElementInStream(PEOPLE);
//
//        System.out.println("amountOfElementsInPeople = " + amountOfElementsInPeople);
//
//
//        Person youngestPerson = examples.getYoungestPerson(PEOPLE).get();
//
//        System.out.println("youngestPerson = " + youngestPerson);
//
//        System.out.println(examples.getOldestPerson(PEOPLE).get());


//        examples.printoutPeople(PEOPLE);
//
//
//        List<Person> females = examples.filterFemalesAndReturnList(PEOPLE);


//        examples.filterFemalesAndAgeAbove17AndPrintOut(PEOPLE);


        List<String> strings = Arrays.asList("a", "b", "c");

        Stream<String> fromList = strings.stream().filter(s -> s.equalsIgnoreCase("a"));



//
//        Stream<Integer> numbers = Stream.iterate(0,
////                new UnaryOperator<Integer>() {
////            @Override
////            public Integer apply(Integer integer) {
////                return integer + 1;
////            }
////        }
//               n -> n + 1
//        );
//
//
//        long count = numbers
//                .skip(20)
//                .limit(100)
//                .filter(integer -> integer % 2 == 0)
//                .count();
//
//
//
////        Now allowed
////        long count1 = numbers.filter(integer -> integer % 2 == 0).limit(1000).count();
//
//
//
//        //Open a new stream
//        long count2 = Stream.of(numbers).count();


        LocalDate[] _1990 = examples.getYearOf(1990);

        LocalDate[] _1945 = examples.getYearOf(1945);

        Map<Month, List<LocalDate>> yearInMonths = examples.getYearInMonths(_1945);



//        Collection<PersonDTO> håkansson = examples.findByLastNameAndConvertToDTO(PEOPLE, "Håkansson");
//
//        håkansson.forEach(System.out::println);




    }




}
