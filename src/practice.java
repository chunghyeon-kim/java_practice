import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {
    System.out.println(pageCalculation(1));
    System.out.println(pageCalculation(8));





} //end of main

    static int pageCalculation (int num) {
        return (int)(Math.ceil(num / 10.0)) * 10;
    }


}  //end of class



