import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("Abc", "BBd", "CaF", "Onn", "PPQ", "BQe");
        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    } //end of main
}  //end of class






