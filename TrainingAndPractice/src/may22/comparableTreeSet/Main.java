package may22.comparableTreeSet;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(1,"nitin",100));
		set.add(new Employee(1,"nitin1",200));
		set.add(new Employee(1,"nitin2",300));
		System.out.println(set);
		SortedMap< Employee, String> sortedMap  = new TreeMap<>();
		
		Set<String> setInteger = new TreeSet<>();
		
	}

}
