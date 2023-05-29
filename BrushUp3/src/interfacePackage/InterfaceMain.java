package interfacePackage;

public class InterfaceMain {

	public static void main(String[] args) {
		long l1 = Long.MAX_VALUE;
		float f1 = l1+10;
		System.out.println("Long value "+ l1);
		System.out.println("Float value "+f1);
		long l2 =(long) f1;
		System.out.println("After change long "+l2);
		
		
	}

}
