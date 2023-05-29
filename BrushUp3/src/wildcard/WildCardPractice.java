package wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WildCardPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,6);
		list.stream().mapToInt(Integer::intValue).sum();
	}
	
	


}
