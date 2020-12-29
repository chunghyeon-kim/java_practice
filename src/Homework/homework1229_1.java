package Homework;

import java.util.Arrays;

public class homework1229_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//q1. 두 배열 arr1과 arr2가 같으면 같습니다. 다르면 다릅니다. 출력
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		boolean result = true;
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				result = result && false;
				break;
			} 
		} //end of i loop
		if(result) System.out.println("같습니다.");
		else System.out.println("다릅니다.");
		
	} //end of main

}
