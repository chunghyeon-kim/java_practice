package Homework;

public class homework1229_4 {
	
	static int mid(int x, int y, int z) {
		//3���� ������ �Է¹޾Ƽ� �� �߿� �߰� ũ���� ���� ��ȯ
		//�ϵ��� �ڵ带 �ۼ��Ͻÿ�.
		int[] arr = {x,y,z};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			} //end of j loop
		} //end of i loop
				
		return arr[1];
	}  //end of method mid
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(mid(100,1,39));
	}

}
