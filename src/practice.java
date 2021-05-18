import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10); // 1~10
        intStream.filter(i -> i%2 != 0 && i%3 != 0).forEach(System.out::print);

        System.out.println();

        intStream = IntStream.rangeClosed(1, 10); // 1~10
        intStream.filter(i -> i%2 != 0).filter(i -> i%3 != 0).forEach(System.out::print);

        System.out.println();

        intStream = IntStream.of(1,2,2,3,3,3,4,5,5,6,7,7,8,8,8);
        intStream.distinct().forEach(System.out::print);


    } //end of main
}  //end of class




