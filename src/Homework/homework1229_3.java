package Homework;

import java.util.Arrays;

public class homework1229_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		q3. �� �迭�� ���ؼ� ���ڰ� ������ B, ���ڿ� ��ġ�� ������ S�� ����
//		�������Ѽ� ���� ����� 1S2B�� ���� �������� ����Ͻÿ�.
		
		//�Ʒ��� ����� 1S1B
		int[] answer = {3,2,1};
		int[] input = {1,2,4};
		int s = 0;  //������ ���� ��ġ�� ���� ���
		int b = 0;  //������ ���� ���� ��ġ�� �ٸ� ���
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i]==input[i]) s++;
		}
		
		boolean result = false;
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<input.length; j++) {
				if(answer[i] == input[j]) result = result || true;
			} //end of j loop
			if(result) b++;
			result = false;
		} // end of i loop
		b = b-s;
		System.out.printf("%dS%dB",s,b);
	} //end of main

}
