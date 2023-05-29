package may21;

import java.lang.instrument.*;
public class SizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public static void premain(String[] args,Instrumentation i) {
		System.out.println("pre main");
		System.out.println(i.getObjectSize(new A()));
	}

}
