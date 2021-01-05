import java.util.*;

public class practice {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()==c2.hashCode());


<<<<<<< HEAD
		int[][] arr = {
				{1,2,3,4,5},
				{1,2,1,1,1},
				{1,1,3,4,5}
		};
        
		int[][] arr2 = arr.clone();
		
		System.out.println(Arrays.deepToString(arr2));
		
    }   //end of main

}  //end of class

=======
	}  //end of main
} //end of class

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString(){
		return "kind : " + kind + ", number : " + number;
	}
	public boolean equals(Object obj){   //equals 오버라이딩 하면 hashCode()도 오버라이딩 해야한다. 규칙!!
		if(!(obj instanceof Card)) return false;
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number == c.number;
	}
	public int hashCode(){   //equals가 같으면 hashCode도 같아야 한다. 규칙!!
		return Objects.hash(kind, number);
	}
}
>>>>>>> ce0f59cbf9a52dbc9845ca48359eb7b0404f1d35
