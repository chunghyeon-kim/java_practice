package Homework;

public class homework1229_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		q2. �� �迭�� ���� ���ڰ� �� �� �ִ��� ����ϴ� �ڵ带 �����ÿ�.
//		�� �迭 ��ҿ� �ߺ��� ���ڰ� ���ٰ� ����.
//		�Ʒ��� ������ �� �迭�� �ߺ��� ���ڴ� 2���̴�.
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
		System.out.println("���� ������ ���� :" + count);

	} //end of main

}
