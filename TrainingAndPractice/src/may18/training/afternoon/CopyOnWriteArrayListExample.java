package may18.training.afternoon;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
//		List<Integer> l1 = new ArrayList<>();
//		l1.add(2);
//		l1.add(7);
//		l1.add(9);
//		l1.add(1);
//		l1.add(4);
//		l1.add(6);
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("hi");
		list.add("welcome");
		list.add("to");
		System.out.println("list is "+list);
		for(String s : list) {
			System.out.println(s);
		}
		list.add("Chennai");
		list.add("TamilNadu");
		System.out.println("Updated List is "+list);
	}

}
