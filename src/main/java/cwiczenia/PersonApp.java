package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person ("Julia", "Nowak1", 24);
        Person person2 = new Person ("Jan", "Nowak2", 25);
        Person person3 = new Person ("Ola", "Nowak3", 26);
        Person person4 = new Person ("Jurek", "Nowak4", 27);
        Person person5 = new Person ("Maciej", "Pawlak", 28);
        Person person6 = new Person ("Magda" , "Nowak5", 29);

        List<Person> people = Arrays.asList(person1, person2, person3, person4, person5, person6);
        consumeList(people, (person-> System.out.println(person)));
       // consumeList(people, (System.out::println));

    }

    static <T> void consumeList (List<T> list, Consumer<T> consumer){
        for (T object:list) { //co jest w liscie, czyli T;
            consumer.accept(object);
        }
    }
}

