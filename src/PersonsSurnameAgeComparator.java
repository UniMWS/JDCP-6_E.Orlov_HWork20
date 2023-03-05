import java.util.Comparator;

public class PersonsSurnameAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurnameSet().size() == o2.getSurnameSet().size())// если одинаково СЛОВ в фамилии
            return Integer.compare(o1.getAge(), o2.getAge());// сравнение по возрасту
        else return Integer.compare(o1.getSurnameSet().size(), o2.getSurnameSet().size());
    }
}
