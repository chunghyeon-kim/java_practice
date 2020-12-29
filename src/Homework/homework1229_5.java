package Homework;

public class homework1229_5 {
	
	static int bingoCnt(int[][] arr) {
		//arr에서 빙고의 갯수를 세어서 반환하도록 코드를 작성하시오.
		
		//check by row
		int bingoCnt=0;
		for(int i=0; i<arr.length; i++) {
			boolean result = true;
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] !=1) result = result && false;
			} //end of j loop
			if(result) bingoCnt++;
		} //end of i loop
		
		//check by diagonal
		boolean result = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i][i] != 1) result = result && false;
		}
		if(result) bingoCnt++;
		
		result = true;
		for(int i=arr.length-1, j=0; i>=0; i--, j++) {
			if(arr[i][j] != 1) result = result && false;
		}
		if(result) bingoCnt++;
		
		//check by column
		result = true;
		for(int j=0; j<arr[0].length; j++) {
			result = true;
			for(int i=0; i<arr.length; i++) {
				if(arr[i][j] != 1) result = result && false;
			} //end of i loop
			if(result) bingoCnt++;
		} //end of j loop
		
	
	return bingoCnt;
	} //end of method bingoCnt
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
		
		System.out.println(bingoCnt(arr));

	} //end of main

}
