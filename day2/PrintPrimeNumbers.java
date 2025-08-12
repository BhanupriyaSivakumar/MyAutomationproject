package seleniumweek1.day2;

public class PrintPrimeNumbers {
	
	
	    public static void main(String[] args) {
	        for (int n = 2; n <= 10; n++) {
	            boolean isPrime = true;

	            // Check for factors from 2 to n-1
	            for (int i = 2; i < n; i++) {
	                if (n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.println(n);
	            }
	        }
	    }
	}

