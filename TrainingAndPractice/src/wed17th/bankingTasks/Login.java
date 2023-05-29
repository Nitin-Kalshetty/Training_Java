package wed17th.bankingTasks;

import java.util.List;
import java.util.Scanner;

public class Login {

	public ClayFin loginUser(List<ClayFin> accounts) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile Number");
		String mobile = sc.next();
		if(mobile.length()!=10) return null;
		String password = sc.next();
		return accounts.stream().filter(u -> u.getMobileNumber().equals(mobile)
				&& u.getPassword().equals(password)).findFirst().get(); 
		
	}
}
