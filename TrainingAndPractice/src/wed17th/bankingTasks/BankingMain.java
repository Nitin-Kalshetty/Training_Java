package wed17th.bankingTasks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {
		List<ClayFin> accounts = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ClayFin Banking System");
		System.out.println();
		System.out.println();
		while(true) {
			System.out.println("Enter 1 to create account");
			System.out.println("Enter 2 to login ");
			System.out.println("Enter 3 to exit");
			int i = 0 ;
			try {
				i = sc.nextInt();
				if(i>3 || i<1) continue;
				
				if(i==1) {
					ClayFin user = new SignUp().modelUser();
					if(user==null) continue;
					accounts.add(user);
					System.out.println("Created Account Successfully.... Please Login...");
					System.out.println("Return to Homepage");
					
				}else if(i==2) {
					ClayFin loggedIn = new Login().loginUser(accounts);
					if(loggedIn == null) {
						System.out.println("Wrong Credentials check once");
						continue;
					}
					
				}else {
					break;
				}
				
			} catch (Exception e) {
				System.out.println(" Please Enter the number {NO CHARACTER OR SPECIAL CHARACTER ARE NO ALLOWED}");
				continue;
			}
			
		}
		System.out.println("Thanks");
	}

}
