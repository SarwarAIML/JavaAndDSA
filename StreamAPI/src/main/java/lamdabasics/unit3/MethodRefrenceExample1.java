package lamdabasics.unit3;

public class MethodRefrenceExample1 {

	public static void main(String[] args) {
			
		//Runnable runnable= ()->printMessage();
		Thread t1 = new Thread(()->printMessage()); 
		t1.start();
		
		System.out.println("--------------");
		//above lambda can be replace with the method reference 
		
		Thread t2 = new Thread(MethodRefrenceExample1::printMessage);//p->method()
		//()->printMessage() == MethodRefrenceExample1::printMessage
		t2.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
