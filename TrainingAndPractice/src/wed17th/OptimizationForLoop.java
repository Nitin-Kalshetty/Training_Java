package wed17th;

public class OptimizationForLoop {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE/6;
		long startForLoop = System.nanoTime();
		System.out.println("Start time of For Loop "+startForLoop);
		for(int i=0;i<max;++i) {
			
		}
		long endForLoop = System.nanoTime()-startForLoop;
		System.out.println("End Time of For Loop "+endForLoop);
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("");
		
		
		int arr[] = new int[max];
		for(int i : arr) {
			arr[i] = 1;
		}
		long startEnhancedForLoop = System.nanoTime();
		System.out.println("Start time of Enhanced Loop "+startEnhancedForLoop);
		for(int i : arr) {
			
		}
		long endEnhancedForLoop = System.nanoTime()-startEnhancedForLoop;
		System.out.println("End time of Enhanced Loop "+endEnhancedForLoop);
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("");
		
		int j = max;
		long startWhile = System.nanoTime();
		System.out.println("Start time of while loop "+startWhile);
		while(--j>=0) {
			
		}
		long endWhile = System.nanoTime()-startWhile;
		System.out.println("End time of while loop "+endWhile);
		
		
		

	}

}
