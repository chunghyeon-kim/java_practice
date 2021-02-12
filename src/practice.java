import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

	System.out.println(p1.equals(p2));
	System.out.println(p1==p2);
} //end of main


}  //end of class

class Person {
	long id;

	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id==((Person)obj).id;
		else
			return false;
	}

	Person(long id) {
		this.id = id;
	}
}

