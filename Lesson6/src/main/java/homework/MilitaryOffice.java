package homework;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MilitaryOffice {
    private PersonDao personDao;

    public int countOfRecruits() {
        Person[] allPersons = personDao.getAllPersons();
        int count = 0;
        for (Person person : allPersons) {
            int age = person.getAge();
            if (age >= 18 && age < 27 && Gender.Male.equals(person.getGender())) {
                count++;
            }
        }
        return count;
    }

    public int countOfRecruitsByCity(String cityName) {
        Person[] allPersons = personDao.getAllPersons();
        int count = 0;
        for (Person person : allPersons) {
            int age = person.getAge();
            String city = person.getAddress().getCity();
            if (age >= 18 && age < 27 && Gender.Male.equals(person.getGender()) && cityName == city) {
                count++;
            }
        }
        return count;
    }

    public int countOfRecruitsByAge(int minAge, int maxAge) {
        Person[] allPersons = personDao.getAllPersons();
        int count = 0;
        for (Person person : allPersons) {
            int age = person.getAge();
            String city = person.getAddress().getCity();
            if (age >= minAge && age <= maxAge) {
                count++;
            }
        }
        return count;
    }

    public int findCountOfRecruitsByName(String recruitName) {
        Person[] allPersons = personDao.getAllPersons();
        int count = 0;
        for (Person person : allPersons) {
            if (recruitName == person.getName()) {
                count++;
            }
        }
        return count;
    }
    //другие методы
}
