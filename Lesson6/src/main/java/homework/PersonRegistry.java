package homework;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonRegistry implements PersonDao {
    private Person[] persons;

    @Override
    public Person[] getAllPersons() {
        return persons;
    }
}
