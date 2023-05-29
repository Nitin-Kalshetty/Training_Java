package removeSpace;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		System.out.println(new RemoveSpace().removeSpaceFromString(str));
		


	}
	
	public String removeSpaceFromString(String str) {
		char[] arr = str.toCharArray();
		int start=0;
		int end=arr.length-1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=end;i++) {
			if(arr[i]!=' ') {
				break;
			}
			sb.append(arr[i]);
			start++;
		}
		for(int i=end;i>=0;i--) {
			if(arr[i]!=' ') {
				break;
			}
			end--;
		}
		for(int i=start;i<=end;i++) {
			if(arr[i]!=' ') {
				sb.append(arr[i]);
			}
		}
		for(int i=end;i<arr.length-1;i++) {
			sb.append(" ");
		}
		
		return sb.toString();
	}

}
