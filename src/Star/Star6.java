package Star;

public class Star6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=5; i++) {
//			for(int j=4-i; j>=0; j--) {
//				System.out.print(" ");
//				
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j >=6) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
