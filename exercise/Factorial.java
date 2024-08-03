public class Factorial {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(fact(n));
	}
	static int fact(int n){
		if (n < 2) return 1;
		return n * fact(n-1);
	}
}