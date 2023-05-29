package tue16th.yesNoTask;

import java.util.Scanner;

public class ThreeChance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = "Nitin";
		String password = "Nitin@3851";
		int i = 3;
		boolean flag = false;
		while (i > 1) {
			String inputName = sc.next();
			String inputpass = sc.next();
			if (inputName.equals(userName) && inputpass.equals(password)) {
				System.out.println("Hooray you got UserName and Password...");
				flag = true;
				break;
			} else {
				i--;
				System.out.println("You left with only " + i + " attempts");
			}
		}
		if (flag) {
			System.out.println("You have completed the program...");
		} else {
			System.out.println("You lost the program...");
		}

	}

}
