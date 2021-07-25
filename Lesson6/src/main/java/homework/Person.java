package homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    private String name;
    private int age;
    private Gender gender = Gender.Female;
    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + gender + '\'' +
                '}';
    }
}
