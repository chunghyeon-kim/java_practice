import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {
    System.out.println("realend 45, 10= " + realEnd(45,10));





} //end of main

    static int realEnd(int total, int amount) {
        return (int)(Math.ceil((total * 1.0) / amount) );
    }


}  //end of class



