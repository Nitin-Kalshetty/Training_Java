package digitQuestion;

public class digitWord {

	public static void main(String[] args) {
		digitWord obj = new digitWord();
		System.out.println(obj.digitToWord(1278));

	}
	
	public String digitToWord(int num) {
		String stringNum = String.valueOf(num);
		String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<stringNum.length();i++) {
			int val = Character.getNumericValue(stringNum.charAt(i));
			sb.append(arr[val]+" ");
		}
		return sb.toString();
		
	}

}