package numberQuestion;

public class NumberQuestion {

	public static void main(String[] args) {
		NumberQuestion nq = new NumberQuestion();
		System.out.println(nq.numberToWord(330));

	}
	
	public String numberToWord(int num) {
		StringBuilder sb = new StringBuilder();
		String str = String.valueOf(num);
		String[] tens = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		String[] hundred = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		if(num<=20) {
			sb.append(tens[num]);
		}else if(num<100){
			
		 sb = num%10==0 ? sb.append(hundred[Character.getNumericValue(str.charAt(0))-2]) :	sb.append(hundred[Character.getNumericValue(str.charAt(0))-2]+" "+tens[Character.getNumericValue(str.charAt(1))]);
		}else if (num<1000) {
		sb = num%10==0 && num%100==0 ? sb.append(tens[Character.getNumericValue(str.charAt(0))] +" hundred ")  :  (num%10==0 ? sb.append(tens[Character.getNumericValue(str.charAt(0))] +" hundred "+hundred[Character.getNumericValue(str.charAt(1))-2])  : sb.append(tens[Character.getNumericValue(str.charAt(0))] +" hundred "+hundred[Character.getNumericValue(str.charAt(1))-2]+" "+tens[Character.getNumericValue(str.charAt(2))]))	;
		}else {
			sb.append("Exceeding 1000");
		}
		return sb.toString();
	}

}
