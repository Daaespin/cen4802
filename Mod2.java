package cen4802;
/**Returns the 10th term of the Fibonacci sequence
 * Method needs a value assigned to n to return something
 * @param n is the term in the Fibonacci sequence that the method finds
 * @param result is the number in the sequence corresponding to the term entered
 * @return the term of the Fibonacci sequence
 * @see text
 */
public class Mod2 {
	public static void main(String[] args) {
		 int n = 10;
	        long result = fibonacci(n);
	        System.out.println("The " +n+ "th term of the Fibonacci sequence is "+result);
	    }
	    public static long fibonacci(int n) {
	        if (n <= 0) {
	            return 0;
	            }else if (n == 1) {
	            return 1;
	            }else {
	        	return fibonacci(n-1) + fibonacci(n-2);
	            }
}}
