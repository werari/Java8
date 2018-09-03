package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonApp {
    private static Predicate<Person> list;
    private static Predicate<Person> predicate;

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
        filterByPredicate(people, person -> person.getAge()>18);
        applyToList(people, person-> {
         person.setAge(person.getAge()+1);
         return person;
        });
    }
    static <T> void consumeList (List<T> list, Consumer<T> consumer){
        for (T object:list) { //co jest w liscie, czyli T;
            consumer.accept(object); }
    }
    static <T> void filterByPredicate(List<T> list, Predicate<T>predicate){
        for (T object:list){
            if(predicate.test(object)){
                System.out.println(object);}
        }
    }
    static <T> void applyToList (List<T> list, Function<T,T> function){
        for (int i = 0; i < list.size(); i++) {
            T afterModification = function.apply(list.get(i));
            list.set(i,afterModification);
        }
    }
}

