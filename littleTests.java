package stupid;

//import java.util.*;

//A class for little tests.

public class littleTests {
	
	public static int noOfDivisors(int n) {
		int count = 0;
		for(int divisor = 2; divisor <= n-1; divisor++) {
			if(n % divisor == 0) {
				count++;
			}
		}
		return count;
	}
	
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
