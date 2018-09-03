package cwiczenia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        // numbers.stream().forEach(number-> System.out.println(number));
        List<Integer> afterMondification = numbers.stream()
                .filter(number -> number % 2 == 0)
                .peek(number -> System.out.print(number + " "))
                .map(number -> number * 2)
                .peek(number -> System.out.print(number + " "))
                .collect(Collectors.toList());


        Integer integer = numbers.stream()
                .filter(number -> number > 10)
                .map(number -> number * 10)
                .min(Integer::compareTo)
                .get();
        //większe niż 10
        //mnożymy razy 10
        //find min z podanych
 List<String> listOfNames= Arrays.asList("Anna", "Julia", "Piotr", "Pawel", "Magda","Maciej");

listOfNames.stream()
.filter(name-> name.length()>5)
.map(name-> name.toUpperCase())
.map(name-> "@"+name)
.limit(2)
.forEach(System.out::println);
//zostawić tylko imiona mające 5 liter
        //wszystkie do UpperCase
        //dodać @ z przodu
        //organizczyc do dwóch osob
        //wysmietlić
    }

    //Optional do sprawdzenia
}
