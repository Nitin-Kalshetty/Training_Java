package sortCharacter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(new SortCharacter().sortOnlyCharacter(str));

	}

	public String sortOnlyCharacter(String str) {
		List<Character> charList = new ArrayList<>();
		char[] arr = str.toCharArray();
		for(char ch : arr) {
			int val = (int) ch;
			if(val<48 || val>57) {
				charList.add(ch);
			}
		}
		Collections.sort(charList);
		StringBuilder sb = new StringBuilder();
		int charHelper = 0;
		for(char ch : arr) {
			int val = (int) ch;
			if(val<48 || val>57) {
				sb.append(charList.get(charHelper++));
			}else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
