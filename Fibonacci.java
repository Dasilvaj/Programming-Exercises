public class Fibonacci { // Recursive Method to generate Fibonacci numbers
	public int fib (int N) {
		if (N == 0){
			return 0;
	    	}
	    	else if (N == 1){
	    		return 1;
	    	}
		int val = fib(N-1) + fib(N - 2);
	        return val;
	}
}
