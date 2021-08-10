package se.lexicon.simon;

import se.lexicon.simon.model.Gender;
import se.lexicon.simon.model.Person;
import se.lexicon.simon.util.PersonGenerator;

import java.util.*;
import java.util.function.BinaryOperator;
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


        examples.filterFemalesAndAgeAbove17AndPrintOut(PEOPLE);



    }




}
