
//A class for outputting all prime numbers in a given range.

public class littleTests {
	
	//calculate the number of divisors of a given number
	public static int noOfDivisors(int n) {
		int count = 0;
		for(int divisor = 2; divisor <= n-1; divisor++) {
			if(n % divisor == 0) {
				count++;
			}
		}
		return count;
	}
	
	//if a number n does not have divisors in interval [2, n], it is a prime number
	public static void primeNumsTo(int n) {
		for(int i = 2; i<=n; i++) {
			if(noOfDivisors(i) == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		primeNumsTo(1000);
	}

}
