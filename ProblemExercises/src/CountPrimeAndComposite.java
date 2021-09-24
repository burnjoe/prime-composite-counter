
public class CountPrimeAndComposite {

	// more compact
	public static void main(String[] args) {
		
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		int composite = 0, prime = 0;
		boolean isPrime = true;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 2) {
				continue;
			} 

			for (int n = 2; n < array[i]-1; n++) {
				if (array[i] % n == 0 && array[i] != 2) {
					isPrime = false;
					composite++;
					break;
				}
			}
			
			if (isPrime) {
				prime++;
			} else {
				isPrime = true;
			}
		}
		
		// prints the result
        System.out.println("There are " + prime + " prime numbers.");
        System.out.println("There are " + composite + " composite numbers.");
	}
}
