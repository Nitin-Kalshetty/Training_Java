package may19.AgentInstrumentation;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long obj = ObjectSizeFetcher.getObjectSize(new String("Hello"));
		System.out.println(obj);
	}

}
