package Star;

public class Star9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=2-Math.abs(3-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=Math.abs(3-i)*2+1; k++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}
