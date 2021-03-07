import javax.swing.*;
import java.io.*;
import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;


public class practice {
public static void main(String[] args)  {

    Stream<String[]> strArrStrm = Stream.of(
            new String[]{"abc", "def", "jkl"},
            new String[]{"ABC", "GHI", "JKL"}
    );

    Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

    strStrm.map(String::toLowerCase)
            .distinct()
            .sorted()
            .forEach(System.out::println);




} //end of main


}  //end of class



