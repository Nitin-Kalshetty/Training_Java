package highestThird;


public class HighestThird {

	public static void main(String[] args) {
		int[] arr1 = {6,10,9,8};
		System.out.println(new HighestThird().thirdHighestNumber(arr1));

	}
	
	public int thirdHighestNumber(int[] arr) {
		int index = 0;
		int first = Integer.MIN_VALUE,second=Integer.MIN_VALUE,third = Integer.MIN_VALUE;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>=first) {
				first = arr[i];
				index = i;
			}
		}
		arr[index]= second;
		for(int i=0;i<n;i++) {
			if(arr[i]>=second) {
				second = arr[i];
				index = i;
			}
		}
		arr[index]= third;
		for(int i=0;i<n;i++) {
			if(arr[i]>=third) {
				third = arr[i];
				index = i;
			}
		}
		return third;
		
		
	}

}
