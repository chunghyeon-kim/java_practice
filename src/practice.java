import java.io.File;
import java.util.*;

public class practice {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		HashSet set = new HashSet(list);
		TreeSet tset = new TreeSet(set);
		Stack stack = new Stack();
		stack.addAll(tset);

		while(!stack.empty())
			System.out.println(stack.pop());
	}


}  //end of class



