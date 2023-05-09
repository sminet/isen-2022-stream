package fr.yncrea.cin3.stream.service;

import fr.yncrea.cin3.stream.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DataProvider {
    public List<Person> fetchFamily() {
        var result = new LinkedList<Person>();

        var pierre = new Person("Neal", "Stevie", 73, Collections.emptyList());
        var melisa = new Person("Harding", "Melisa", 82, Collections.emptyList());

        var kiera = new Person("Neal", "Kiera", 79, Arrays.asList(pierre, melisa));

        var elisa = new Person("Serrano", "Elisa", 71, Collections.emptyList());
        var julius = new Person("Neal", "Julius", 62, Arrays.asList(pierre, melisa));
        var alexander = new Person("Neal", "Alexander", 67, Arrays.asList(elisa, julius));
        var kelsey = new Person("Neal", "Kelsey", 67, Arrays.asList(elisa, julius));
        var aliyah = new Person("Neal", "Aliyah", 67, Arrays.asList(elisa, julius));

        result.add(pierre);
        result.add(melisa);
        result.add(kiera);
        result.add(elisa);
        result.add(julius);
        result.add(alexander);
        result.add(kelsey);
        result.add(aliyah);

        return result;
    }
}
