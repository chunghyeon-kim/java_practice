import java.util.*;

public class practice {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression:" + expression);
		
		try{
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch + "");
				} else if (ch==')') {
					st.pop();
				}
			} //end of i loop
			
			if(st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} catch(EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}

		
		
		
		
	}

}

