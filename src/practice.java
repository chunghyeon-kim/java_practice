import java.io.File;
import java.util.*;


public class practice {
	public static void main(String[] args) {
		

	} //end of main




}  //end of class


class MyVector{
	//배열기반
	int size;
	Object[] objArr;

	MyVector(int capacity){   //생성자
		objArr = new Object[capacity];
	}

	MyVector(){
		this(16);
	}

	int size(){
		int tmp = 0;
		for(int i=0; i<objArr.length; i++){
			if(objArr[i]!=null) tmp++;
		}
		return tmp;
	}

	int capacity(){
		return objArr.length;
	}

	boolean isEmpty(){
		for(int i=0; i<objArr.length; i++){
			if(objArr[i]!=null) return false;
		}
		return true;
	}

	void clear(){
		for(int i=0; i<objArr.length; i++){
			objArr[i]=null;
		}
	}

	Object get(int index){
		return objArr[index];
	}

	int indexOf(Object obj){
		//equals() 오버라이딩???..... 모르겠다
		//일단 Object배열에 문자열이 들어있는 상황에서 메서드 작성
		for(int i=0; i<this.size(); i++){
			if(objArr[i].equals(obj))
				return i;
		}
		return -1;
	}

	void add(Object obj){
		for(int i=0; i<objArr.length; i++){
			if(objArr[i]==null) {objArr[i]=obj; return;}
		}
		System.out.println("FULL"); return;
	}

	void setCapacity(int capacity){
		Object[] tmp = new Object[capacity];
		for(int i=0; i<this.objArr.length; i++){
			tmp[i] = this.objArr[i];
		}
		this.objArr = tmp;
	}

	void ensureCapacity(int minCapacity){  //size(),setCapacity() 이용할 수 있을 것 같다.
		//용량 확보 - 현재 들어있는 객체 개수 + minCapacity 크기의 배열 생성, 복사, 참조변경
		//                size()
		//          [------------setCapacity-------]

		Object[] tmp = new Object[this.size() + minCapacity];  //용량확보한 배열 생성
		for(int i=0; i<this.size(); i++){                      //원래있던 자료 복사
			tmp[i] = objArr[i];
		}
		objArr = tmp;                                          //참조변

	}

	Object remove(int index){    //index+1 번째부터 끝까지 앞으로 한칸씩 당기고 마지막은 null대입
		for(int i=index; i<this.size(); i++){
			objArr[i] = objArr[i+1];   //차례대로 덮어씌우기
		}
		objArr[this.size()] = null;          //마지막은 null 대입
		return 1;
	}



}  //end of class MyVeector
