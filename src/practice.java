import java.util.*;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}  //end of main
	static void install() throws installException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException2 e) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e);   //SpaceException2 가 InstallException의 원인예외
			throw ie;
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();    //프로그램 설치에 사용된 임시파일 제거
		}   //end of try

	}  //end of method install

	static void startInstall() throws SpaceExcpetion2, MemoryException2{
		if(!enoughSpace()) {
			throw new SpaceException2("설치할 공간이 부족합니다.");
		}
		if(!enoughMemory()){
			throw new MemoryException2("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException2("메모리가 부족합니다."));
		}

	}  //end of startInstall

	static void copyFiles() { /*파일을 복사하는 코드를 넣는다*/}
	static void deleteTempFiles() {/*임시파일들을 삭제하는 코드를 넣는다*/}

	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}

	static boolean enoughMemory(){
		//설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return false;
	}

} //end of class


class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceExcpetion2 extends Exception {
	SpaceException2(String msg){
		super(msg);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String msg){
		super(msg);
	}
}