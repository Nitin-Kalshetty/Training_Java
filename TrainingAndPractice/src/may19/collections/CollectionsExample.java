package may19.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");
        

        List destinationList = new ArrayList();
        destinationList.add("Mango");
        destinationList.add("Grapes");
        destinationList.add("Pineapple");
        destinationList.add(new ArrayList());
        destinationList.add(15);
        destinationList.add(1458);
        System.out.println("Destination List: " + destinationList);
		
		
	}
}
