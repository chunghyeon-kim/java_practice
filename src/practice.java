
public class practice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("01");  //01로 시작하는 18칸짜리 StringBuffer생성
		StringBuffer sb2 = sb.append(23);  //0123
		sb.append('4').append(56);
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb =" +sb);
		System.out.println("sb2 =" +sb2);
		System.out.println("sb2 =" +sb3);   //0123456789.0
		
		System.out.println("sb =" + sb.deleteCharAt(10));
		System.out.println("sb =" + sb.delete(3, 6));
		System.out.println("sb =" + sb.insert(3, "abc"));
		System.out.println("sb =" + sb.replace(6, sb.length(), "END"));
		
		System.out.println("capacity=" + sb.capacity());
		System.out.println("length=" + sb.length());
		System.out.println("length=" + sb.length());
		
		
	}

}

