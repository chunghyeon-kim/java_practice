class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drivd");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!");
	}
}

class FireEngine2 extends FireEngine{
	void booster() {
		System.out.println("booster!");
	}
}


public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = new Object();
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine2 fe2 = new FireEngine2();
		
//		System.out.println(fe instanceof Object);
		
//		System.out.println(fe instanceof FireEngine);
//		System.out.println(fe instanceof FireEngine2);
		System.out.println(fe instanceof Car);
//		if(fe instanceof Car) {
//			car = (Car)fe;
//		}
		
		System.out.println(car instanceof FireEngine);
		
		
		
		
		
		
		
		
	}

}
