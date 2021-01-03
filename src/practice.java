import java.util.*;

public class practice {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = {"cat", "Dog", "lion", "tiger"};

		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2){
		if(o1 instanceof Comparable && o2 instanceof Comparable){
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
		}  //test
		return -1;
	}
}