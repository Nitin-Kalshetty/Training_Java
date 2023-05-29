package wed17th;

import java.util.Date;
import java.util.Scanner;

public class TaskDate {

	public static void main(String[] args) {

//		Date utilDate = new Date();
//		System.out.println("Current Date");
//		System.out.println(utilDate);
//		System.out.println("********************************");
//		System.out.println("********************************");
//		System.out.println("After adding 55 days to current date");
//		System.out.println(addDate(utilDate, 55));
//		System.out.println("********************************");
//		System.out.println("********************************");
//		System.out.println("After adding 3 months to current date");
//		System.out.println(addMonth(utilDate, 3));
//		System.out.println("********************************");
//		System.out.println("********************************");
//		System.out.println("After adding 2 years to current date");
//		System.out.println(addYear(utilDate, 2));
//		System.out.println("********************************");
//		System.out.println("********************************");
		
		
		Scanner sc = new Scanner(System.in);
		String stringDate = sc.next();
		
		

	}
	
	public static Date addDate(Date old,Integer days) {
		return new Date(old.getYear(),old.getMonth(),(old.getDate()+days));
	}
	
	public static Date addMonth(Date old,Integer months) {
		return new Date(old.getYear(),(old.getMonth()+months),(old.getDate()));
	}
	public static Date addYear(Date old,Integer years) {
		return new Date((old.getYear()+years),old.getMonth(),(old.getDate()));
	}
	
	public static String checkTenseOfDate(Date date) {
		if(date.after(new Date())) {
			return "Future";
		}else if(date.before(new Date())) {
			return "Past";
		}else {
			return "Present";
		}
	}
	

}
