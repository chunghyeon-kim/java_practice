package Homework;

import java.util.Arrays;

public class homework1229_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//q1. �� �迭 arr1�� arr2�� ������ �����ϴ�. �ٸ��� �ٸ��ϴ�. ���
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		boolean result = true;
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				result = result && false;
				break;
			} 
		} //end of i loop
		if(result) System.out.println("�����ϴ�.");
		else System.out.println("�ٸ��ϴ�.");
		
	} //end of main

}
