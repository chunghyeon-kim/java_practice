package Homework;

import java.util.Arrays;

public class homework1229_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		q3. 두 배열을 비교해서 숫자가 같으면 B, 숫자와 위치가 같으면 S의 값을
//		증가시켜서 최종 결과를 1S2B와 같은 형식으로 출력하시오.
		
		//아래의 결과는 1S1B
		int[] answer = {3,2,1};
		int[] input = {1,2,4};
		int s = 0;  //숫자의 값과 위치가 같은 경우
		int b = 0;  //숫자의 값은 같고 위치가 다른 경우
		
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
