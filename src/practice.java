import javax.swing.*;
import java.io.*;
import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

import static java.util.stream.Collectors.partitioningBy;


public class practice {
public static void main(String[] args)  {

Tv t1 = new Tv();
t1.color = "Black";
t1.power = true;
t1.channel = 10;

    Tv t2 = new Tv();
    t2.color = "Black";
    t2.power = false;
    t2.channel = 6;

    System.out.println(t1);
    System.out.println(t2);



} //end of main


}  //end of class

class Tv {
    String color;
    boolean power;
    int channel;

    public String toString() {
        return "color: " + color + " power: " + power + " channel: " + channel;
    }
}

