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

Map<Boolean, Optional<Student>> topScoreBySex =
        stuStream.collect(partitioningBy(Student::isMale, maxBy(comparingInt(Student::getScore))));
    System.out.println("남학생 1등 :"+ topScoreBySex.get(true));
    System.out.println("여학생 1등 :"+ topScoreBySex.get(false));

Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex =
        stuStream.collect(partitioningBy(Student::isMale, partitioningBy(s->s.getScore() < 150)));
List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);


} //end of main


}  //end of class



