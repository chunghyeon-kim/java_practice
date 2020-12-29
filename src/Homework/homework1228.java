package Homework;

import java.util.Arrays;

public class homework1228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1번. 중복제거
		int[] arr = {4,7,1,1,3,7,6,2,4,4,2,8,3,9,2};
		int[] count = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]!=0) System.out.print(i);
		}
		
		System.out.println();
		
		
		//2번. 정렬
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			}  //end of j loop
//		}  //end of i loop
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<count.length; i++) {
			for(int j=1; j<=count[i]; j++) {
				System.out.print(i);
			}
		}
		
		
		
	} //end of main

} //end of class