package se.lexicon.simon;

import se.lexicon.simon.model.Person;
import se.lexicon.simon.util.PersonGenerator;

import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Collection<Person> PEOPLE = PersonGenerator.getInstance().generate(1000);


    public static void main( String[] args )
    {

    }
}
