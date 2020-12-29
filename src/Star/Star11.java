package Star;

public class Star11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
//				if(i<=j)  //2번
//				if(i>=j)  //3번
//				if(i+j>=6) //4번
//				if((i+j<=6) && (i>=j)) //1번
				if( ((i<=j) && (i+j>=6)) || ((i+j<=6) && (i>=j)) ) //1번
				System.out.printf("*",i,j);
				
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
