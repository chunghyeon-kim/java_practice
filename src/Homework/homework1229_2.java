package Homework;

public class homework1229_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		q2. 두 배열에 같은 숫자가 몇 개 있는지 출력하는 코드를 적으시오.
//		두 배열 요소에 중복된 숫자가 없다고 가정.
//		아래의 예에서 두 배열에 중복된 숫자는 2개이다.
		int[] arr3 = {1,3,4};
		int[] arr4 = {1,2,3};
		
		int count = 0;
		boolean result = false;
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr4.length; j++) {
				if(arr3[i] == arr4[j]) result = result || true;
			} // end of j loop
			if(result) count++;
			result = false;
		} // end of i loop
		System.out.println("같은 숫자의 개수 :" + count);

	} //end of main

}
