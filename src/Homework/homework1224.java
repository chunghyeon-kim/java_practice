package Homework;

import java.util.Arrays;

public class homework1224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*9);
		}
		
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++;
		}

		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(counter));
		
		for(int i=0; i<counter.length; i++) {
			System.out.printf("%d�� ���� : %d%n", i,counter[i]);
		}
		
	}

}
