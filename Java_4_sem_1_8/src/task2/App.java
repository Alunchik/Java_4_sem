package task2;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Human human1 = new Human(20, "John", "Doe", LocalDate.of(2003, 1, 1), 85);
        Human human2 = new Human(18, "Abe", "Der", LocalDate.of(1920, 12, 12), 53);
        Human human3 = new Human(19, "Gor", "Bfe", LocalDate.of(2004, 2, 23), 15);
        Human human4 = new Human(20, "Csr", "Xaf", LocalDate.of(1930, 4, 28), 58);
        Human human5 = new Human(21, "Ofd", "Bur", LocalDate.of(1980, 5, 13), 90);
        Stream<Human> stream = Stream.of(human1, human2, human3, human4, human5);
        stream.sorted((a, b) -> a.birthDate.compareTo(b.birthDate)).forEach(System.out::println);
        System.out.println();
        stream = Stream.of(human1, human2, human3, human4, human5);
        stream.filter((human) -> human.age < 50).forEach(System.out::println);
        System.out.println();
        stream = Stream.of(human1, human2, human3, human4, human5);
        stream.sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
        stream = Stream.of(human1, human2, human3, human4, human5);
        System.out.println((stream.reduce((accumulator, human) ->
                        new Human(0, accumulator.firstName + " " + human.firstName, "", LocalDate.of(1980, 5, 13), 90))).get().firstName);
    }

}
