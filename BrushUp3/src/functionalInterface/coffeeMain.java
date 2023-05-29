package functionalInterface;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class coffeeMain {

	public static void main(String[] args) {
		Coffee c  = new Coffee();
		try {
			Method method = Coffee.class.getDeclaredMethod("coffeeMethod");
			method.setAccessible(true);
			try {
				method.invoke(c);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
