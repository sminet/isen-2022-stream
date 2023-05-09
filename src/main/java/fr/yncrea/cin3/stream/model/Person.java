package fr.yncrea.cin3.stream.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person {
    @EqualsAndHashCode.Include
    private String name;

    @EqualsAndHashCode.Include
    private String firstname;

    private int age;

    private List<Person> parents;
}
