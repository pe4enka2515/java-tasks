import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String args[]) {

        ArrayList<Human> humans = new ArrayList();

        humans.add(new Human(19, "Kirill", "Kosogorov", LocalDate.of(2003,3,28), 60));
        humans.add(new Human(11, "Katya", "Kosogorova", LocalDate.of(2010,2,2), 32));
        humans.add(new Human(18, "Fedor", "Trushin", LocalDate.of(2004,5,11), 86));
        humans.add(new Human(68, "Kirill", "Kosogorov", LocalDate.of(1954,8,22), 74));

        Stream<Human> hums = humans.stream();

        System.out.println("1 task:");
        humans.stream().sorted(Comparator.comparingInt(Human::getAge)).forEach(Human::printHuman);
        System.out.println("2 task:");
        humans.stream().filter(age -> age.getAge() < 20).forEach(Human::printHuman);
        System.out.println("3 task");
        humans.stream().filter(firstName -> firstName.getFirstName().contains("e")).forEach(Human::printHuman);
        System.out.println("4 task");
        String konc = "";
        humans.stream().map(Human::getFirstChar).forEach(System.out::print);
    }
}