import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 5);
        IntStream intStream2 = IntStream.rangeClosed(1, 5);

        intStream.forEach(System.out::print);
        System.out.println();
        intStream2.forEach(System.out::print);

        List<Integer> list = Arrays.asList(1, 2, 3,4, 5);
        Stream<Integer> intStream3 = list.stream();

        intStream3.forEach(System.out::print);

        System.out.println();

        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::print);
    } //end of main
}  //end of class




