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

//    int[] arr = null;
      int[] arr = new int[0];
    System.out.println("arr.length=" + arr.length);

//    Optional<String> opt = null;  //OK. 하지만 바람직X
    Optional<String> opt = Optional.empty();
//    Optional<String> opt = Optional.of("abc");

    String str = "";

    str = opt.orElse("EMPTY"); //Optional에 저장된 값이 null이면 ""반환
//    str = opt.orElseGet( ()->new String());
    str = opt.orElseGet(String::new);
    System.out.println("str=" + str);


} //end of main


}  //end of class



