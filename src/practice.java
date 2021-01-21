import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {

   	ArrayList list = new ArrayList();
   	list.add("1");
   	list.add("2");
   	list.add("3");
   	list.add("4");
   	list.add("5");

   	Iterator it = list.iterator();

   	while(it.hasNext()){
		System.out.println(it.next());
	}


	} //end of main


}  //end of class



