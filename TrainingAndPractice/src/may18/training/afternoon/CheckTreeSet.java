package may18.training.afternoon;


import java.util.Set;
import java.util.TreeSet;

public class CheckTreeSet {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("alpha");
		set.add("ALPHA");
		set.add("ALpha");
		System.out.println(set);

	}

}
