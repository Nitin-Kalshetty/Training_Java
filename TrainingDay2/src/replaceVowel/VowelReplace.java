package replaceVowel;

public class VowelReplace {

	public static void main(String[] args) {
		
		System.out.println(new VowelReplace().replaceVowelWithStar("aeNou"));
		
	}
	
	public String replaceVowelWithStar(String str) {
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		int arSize = arr.length;
		for(int i=0;i<arSize;i++) {
			char ch = arr[i];
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				arr[i] = '*';
			}
		}
		return new String(arr);
	}
}
