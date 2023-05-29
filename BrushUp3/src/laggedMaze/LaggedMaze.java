package laggedMaze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaggedMaze {

	public static void main(String[] args) {
		swap(21,32);
		
	}
	
	public static void swap(int a, int b) {
		System.out.println("Before swaping a is : "+a);
		System.out.println("Before swaping b is : "+b);
		
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println("After swaping a is : "+a);
		System.out.println("After swaping b is : "+b);
	}
	

}
