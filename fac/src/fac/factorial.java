package fac;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = factorial(2);
		System.out.println(fact);
		
		int result = count(3);
		System.out.println(result);
		
		int fibonacci = fibo(4);
		System.out.println(fibonacci);
	}
//	Factorial
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
			
		}else {
			return n*factorial(n-1);
	}
}
//	count the numbers
	public static int count(int x) {
		if(x > 0) {
			return x + count(x-1);
		}
		else {
			return 0;
		}
		
	}
// Fibonacci
	public static int fibo(int f) {
		if(f<0) {
			return -1;
		}
		else if(f==0 || f==1) {
			return f;
		}
		else {
			return fibo(f-1)+ fibo(f-2);
		}
	}
}