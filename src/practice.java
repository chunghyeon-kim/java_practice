import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        int count = intStream.reduce(0, (a,b) -> a+1);
        int sum = intStream.reduce(0, (a,b) -> a+b);
        int max = intStream.reduce(Integer.MIN_VALUE, (a,b) -> a>b ? a:b);
        int min = intStream.reduce(Integer.MAX_VALUE, (a,b) -> a<b ? a:b);

        OptionalInt max = intStream.reduce(Integer::max);
        OptionalInt min = intStream.reduce(Integer::min);

        int maxValue = max.getAsInt();
    } //end of main
}  //end of class






