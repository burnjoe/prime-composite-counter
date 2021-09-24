
public class CountPrimeAndComposite {
	
	public static void main(String[] args) {
		
		// fgiven array
		int[] array = {-1,0,1,2,3,4,5,6,7,8,9};
		
		// counters and a flag
		int composite = 0, prime = 0;
		boolean isPrime = true;
		
		// traverse the array
		for (int i = 0; i < array.length; i++) {
			// skip the count if numbers is 0,1 or a negative #
			if (array[i] < 2) {
				continue;
			} 
			
			// checks if the number is divisible by n
			// which n ranges 2 to half of the element
			for (int n = 2; n < array[i]/2+1; n++) {
				if (array[i] % n == 0 && array[i] != 2) {
					isPrime = false;
					composite++;
					break;
				}
			}
			
			// increment the prime if the element is prime
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
