package exceptionHandlings;

public class ExceptionMain {

	static int i =1;
	public static void main(String[] args) {
		System.out.print(i+",");
		m(i);
		System.out.println(i);
	}
	
	public static void m(int i){
	i += 2;
	}

	

}
