public class FibonacciRecursion {
	public static void main(String[] args) {
		fibo(0,1,50,0);
	}
	static void fibo(int n1, int n2, int till, int index){
		if (index > till - 1) return;
		System.out.println(n1);
		index++;
		fibo(n2, n1 + n2, till, index);
	}
}