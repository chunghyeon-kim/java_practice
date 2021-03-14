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

Tv t = new Tv();
t.color = "Black";
t.power = true;
t.channel = 10;

    System.out.println(t);



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

