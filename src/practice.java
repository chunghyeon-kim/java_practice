import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::print);

		int[] intArr = {1,2,3,4,5};
		IntStream str1 = Arrays.stream(intArr);
		str1.forEach(System.out::print);

	} //end of main


}  //end of class



