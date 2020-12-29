package Homework;

public class homework1229_4 {
	
	static int mid(int x, int y, int z) {
		//3개의 정수를 입력받아서 그 중에 중간 크기의 값을 반환
		//하도록 코드를 작성하시오.
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
