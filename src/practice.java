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

Unit u = new Unit();
    u.init();
    System.out.println(u.dir);



} //end of main


}  //end of class

enum Direction {EAST, SOUTH, WEST, NORTH}

class Unit {
    int x, y;
    Direction dir;

    void init() {
        dir = Direction.EAST;
    }
}

