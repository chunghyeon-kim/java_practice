import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;


public class practice {
public static void main(String[] args)  {

    List<Integer> list = Arrays.asList(3,1,5,4,2);
    List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

    System.out.println(list);
    System.out.println(sortedList);





} //end of main


}  //end of class



