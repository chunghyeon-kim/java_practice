package pkg1;

public class MyParent{
	private 	int prv;   //���� Ŭ����
				int dft;   //���� ��Ű��
	protected 	int prt;   //���� ��Ű�� + �ڼ�(�ٸ���Ű��)
	public 		int pub;   //���Ѿ���
	
	public void printmembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
//		System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
		

	}

}
