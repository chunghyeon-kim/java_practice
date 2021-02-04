import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {
	char ch = '@';
	boolean check = true;
	if(  !(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9'))    )

	{check=false;}
	System.out.println(check);

	String str = "abc@#$";
	boolean check2 = true;
	for(int i=0; i<str.length(); i++) {
		char ch2 = str.charAt(i);
		if(  !(('a'<=ch2 && ch2<='z') || ('A'<=ch2 && ch2<='Z') || ('0'<=ch2 && ch2<='9'))    )
		{check2=false;}
	} System.out.println("check2=" + check2);


	} //end of main


}  //end of class



