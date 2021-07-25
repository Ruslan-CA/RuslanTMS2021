package homework;

public class Main {
    public static void main(String[] args) {
        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(createPersons()));
        System.out.println("Общее количество годных призывников " + militaryOffice.countOfRecruits());
        System.out.println("Количество годных призывников из определенного города  " + militaryOffice.countOfRecruitsByCity("Минск"));
        System.out.println("Количество призывников от 25 до 27 лет " + militaryOffice.countOfRecruitsByAge(25, 27));
        System.out.println("Количество призывников с определенным именем " + militaryOffice.findCountOfRecruitsByName("Александр"));
    }

    public static Person[] createPersons() {
        Person[] people = new Person[5];
        //создаем людей и добавляем в Registry
        Address Address1 = new Address("Беларусь", "Витебск");
        Person person1 = new Person("Константин", 20, Gender.Male, Address1);
        people[0] = person1;

        Address Address2 = new Address("Беларусь", "Минск");
        Person person2 = new Person("Глеб", 25, Gender.Male, Address2);
        people[1] = person2;

        Address Address3 = new Address("Беларусь", "Браслав");
        Person person3 = new Person("Александр", 38, Gender.Male, Address3);
        people[2] = person3;

        Address Address4 = new Address("Беларусь", "Сморгонь'");
        Person person4 = new Person("Вадим", 27, Gender.Male, Address4);
        people[3] = person4;

        Address Address5 = new Address("Беларусь", "Витебск");
        Person person5 = new Person("Ольга", 20, Gender.Female, Address5);
        people[4] = person5;

        return people;
    }

}
