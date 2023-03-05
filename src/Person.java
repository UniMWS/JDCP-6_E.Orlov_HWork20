import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int age;
    Set<String> surnameSet = new HashSet<>();// все СЛОВА фамилии в множество для получения количества

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        Collections.addAll(this.surnameSet, surname.split("\\P{IsAlphabetic}+"));
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public Set<String> getSurnameSet() {
        return surnameSet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("\n%s %s - %d лет", getName(), getSurname(), getAge());
    }
}
