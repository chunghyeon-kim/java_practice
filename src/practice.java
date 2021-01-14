import javax.swing.*;
import java.io.File;
import java.util.*;



public class practice {
public static void main(String[] args) throws Exception {
	Map<String, String> map = new HashMap<>();
	map.put("1","2");
	map.put("2","3");
	map.put("3","4");
	map.put("4","5");

	map.forEach((k,v) -> System.out.print("{"+k+","+v+"},"));

	} //end of main


}  //end of class



