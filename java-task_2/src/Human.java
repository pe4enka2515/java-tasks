import java.time.LocalDate;
import java.util.stream.Stream;

public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public char getFirstChar(){
        char[] firstChar = firstName.toCharArray();
        return firstChar[0];
    }

    public String printHuman(){
        System.out.println(this.age + ", " + this.firstName + ", " + this.lastName + ", " + this.birthDate + ", " + this.weight);
        return "";
    }
}
