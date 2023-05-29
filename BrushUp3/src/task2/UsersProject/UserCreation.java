package task2.UsersProject;

import java.util.HashSet;
import java.util.Set;

public class UserCreation {
	
	
	private static Set<User> userList = new HashSet<>();
	
	public static void main(String[] args) {
		BasicUser b1 = new BasicUser(1, "Nitin", "nitin@gmail", "nitin", "9876543210");
		System.out.println(b1.getDelivery());

		PrimeUser p1 = new PrimeUser(1, "Nitin", "nitin@gmail", "nitin", "9876543210");
		System.out.println(p1.getDelivery());
		userList.add(b1);
		userList.add(p1);
		System.out.println(userList);
	}

}
