package wed17th.bankingTasks;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SignUp {

	public ClayFin modelUser() {
		Scanner sc = new Scanner(System.in);
		int i= 1;
		System.out.println("Enter the Name");
		String name = sc.next();
		
		
		System.out.println("Enter current address");
		String address = sc.nextLine();
		
		
		int typeIndex = 1;
		TYPE[] enumTypes = TYPE.values();
		for(TYPE type : TYPE.values()) {
			System.out.println("Enter "+typeIndex+" for "+type);
			typeIndex++;
		}
		int typeValue = sc.nextInt();
			if(typeValue>typeIndex-1 || typeValue<1) return null;
		TYPE type = enumTypes[typeValue];
		
		
		long balance = sc.nextLong();
			if(balance>Long.MAX_VALUE || balance<1) return null;
			
		String mobile = sc.next();
		if(mobile.length()!=10) return null;
		
		
		String password = sc.next();
		if(password.length()<6) return null;
		
		return new ClayFin(name, address, type, balance, LocalDateTime.now(), mobile, password);
	}
}
