import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {

	//DAO 이용해서 데이터베이스에 접근
	//DTO 이용해서 전송

	int[] arr = {1,2,3,4,5};

	System.out.println(arr);

	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	System.out.println("sum=" + sum);

	} //end of main


}  //end of class



