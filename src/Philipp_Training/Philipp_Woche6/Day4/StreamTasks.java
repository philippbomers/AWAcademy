package Philipp_Training.Philipp_Woche6.Day4;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTasks {
    public static void main(String[] args) {
        List<String> namen = List.of("Bob", "Jane", "John", "Alice", "Jonathan");
        List<String> newList = namen.stream().
                filter(name->name.startsWith("J")).
                filter(name -> name.length()<=4).
                toList();
        System.out.println("namen = " + namen);
        System.out.println("newList = " + newList);


        namen.stream().
                filter(name->name.startsWith("J")).
                filter(name -> name.length()<=4).
                forEach(name -> System.out.println("Name " +name));

        namen.stream().
                filter(name->name.startsWith("J")).
                filter(name -> name.length()<=4).
                map(String::toUpperCase).
                forEach(System.out::println);

        List<String> liste = namen.stream().
                filter(name -> name.startsWith("J")).
                filter(name -> name.length() <= 4).
                map(String::toUpperCase).toList();

        Set<String> set = namen.stream().
                filter(name -> name.startsWith("J")).
                filter(name -> name.length() <= 4).
                map(String::toUpperCase).
                collect(Collectors.toSet());


        /**
         * Optional:
         * Optional<Object> xyz
         * xyz.orElse   <-- wenn null
         *
         *
         * Lambda: (action) -> {}
         * oder: (action) -> {
         * bla
         * bla
         * return blub;
         * }
         */
    }


}
