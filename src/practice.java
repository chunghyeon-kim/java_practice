import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
        evenStream.limit(5).forEach(System.out::print);

        System.out.println();

        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.limit(10).forEach(System.out::print);


    } //end of main
}  //end of class




