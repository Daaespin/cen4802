package cen4802;

public class Mod2 {
	public static void main(String[] args) {
		 int n = 10;
	        long result = fibonacci(n);
	        System.out.println("The " +n+ "th Fibonacci number is "+result);
	    }
	    public static long fibonacci(int n) {
	        if (n <= 0) {
	            return 0;
	            }else if (n == 1) {
	            return 1;
	            }else {
	        	return fibonacci(n-1) + fibonacci(n-2);
	            }
	}

}
