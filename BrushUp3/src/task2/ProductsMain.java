package task2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductsMain<T extends Products> {

	private static Set<Products> setList = new HashSet<>();
	
	public static void main(String[] args) {
		
		setList.add(new Mobiles(1, "Real Me", "First 64MP Camera", 2019, "80454545", 18999));
		setList.add(new Mobiles(2, "Iqoo", "Gaming Performance", 2021, "123456789", 29999));
		setList.add(new Mobiles(3, "Redmi", "Camera Centered", 2023, "987654321", 35999));
		setList.add(new TV(1, "Toshiba", "Unbudget", 2019, "8989898", 86989));
		setList.add(new TV(2, "OnePlus", "Expensive Good Quality", 2021, "78987897", 96989));
		setList.add(new TV(3, "Sony", "Top Notch Quality", 2023, "12358225", 126989));
		
		System.out.println();
		
		
		printAllData(setList);
		System.out.println("****************************");
		List<Mobiles> mobiles = filterMobiles();
		System.out.println(mobiles);
		System.out.println("****************************");
		List<TV> tvs = filterTV();
		System.out.println(tvs);
		
		
	}
	
	
	
	
	
	
	
	public static void addMethod(Products product) {
		setList.add(product);
	}
	
	public static void removeMethod(Products product) {
		setList.remove(product);
	}
	
	public static void updateMethod(Products product) {
		
	}
	
	public static Products getMethod(String str) {
		for(Products product : setList) {
			if(product instanceof Mobiles && ((Mobiles) product).getMobileId().equals(str)) {
				return (Mobiles) product;
			}else if(product instanceof TV && ((TV) product).getTvId().equals(str)) {
				return (TV) product;
			}
		}
		return new Products();
	}
	
	public static List<Mobiles> filterMobiles() {
		return setList.stream().filter(mobile -> mobile instanceof Mobiles).map(s -> (Mobiles) s).collect(Collectors.toList());
	}
	
	
	public List<T> filterAccordingly(T t){
		return setList.stream().filter(pro -> pro.getClass().equals(t.getClass())).map(p -> (T) p).collect(Collectors.toList());
	}
	
	
	
	
	public static List<TV> filterTV(){
		return setList.stream().filter(tv -> tv instanceof TV).map(t -> (TV) t).collect(Collectors.toList());
	}
	
	public static void printAllData(Set<? extends Products> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}

}
