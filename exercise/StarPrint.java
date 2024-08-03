import java.util.Scanner;

public class StarPrint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();

		// for(int i=1;i<=n;i++){
		// 	for(int j=1;j<=i;j++){
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }

		// for(int i=1;i<=n;i++){
		// 	for(int j=1;j<=n-i+1;j++){
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }

		// for(int i=1;i<=n;i++){
		// 	for(int j=1;j<=i;j++){
		// 		System.out.print(j + " ");
		// 	}
		// 	System.out.println();
		// }

		// for(int i=1;i<=2*n-1;i++){
		// 	int colsInRow = (i>n)?2*n-i:i; 
		// 	for(int j=1;j<=colsInRow;j++){
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }

		// for(int i = 1;i <= n;i++){
		// 	for(int j = 1;j <= n-i;j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1;j <= i;j++){
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// for(int i = 1;i <= n;i++){
		// 	for(int j = 1;j <= n-i;j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1;j <= i;j++){
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }

		// for(int i = 1;i <= n;i++){
		// 	for(int j = 1;j <= i-1;j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1;j <= n-i+1;j++){
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// for(int i = 1;i <= n;i++){
		// 	for(int j = 1;j <= n-i;j++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1;j <= (i*2)-1;j++){
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		for(int i = 1;i <= n;i++){
			for(int j = 0;j < i;j++){
				System.out.print(" ");
			}
			for(int j = 0;j <= 2*(n-i);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}