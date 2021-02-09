import javax.swing.*;
import java.io.*;
import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class practice {
public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	System.out.print("양의 정수 10개 입력: ");
	int[] arr = new int[10];

	for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}

	System.out.print("3의 배수: ");
	for(int i=0; i<arr.length; i++) {
		if (arr[i] % 3 == 0) {
			System.out.print(arr[i] + " ");
		}
	}

	sc.close();

	} //end of main


}  //end of class



