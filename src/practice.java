import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {
	Singleton test1 = Singleton.getInstance();
	Singleton test2 = Singleton.getInstance();

	System.out.println(test1==test2);

} //end of main


}  //end of class

class Singleton{
	private int value;
	private Singleton(){}
	private static Singleton instance = new Singleton();
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();


		}
		return instance;
	}

}

