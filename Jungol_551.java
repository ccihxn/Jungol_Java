import java.util.Scanner;

public class Jungol_551 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>i;j--) System.out.print(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}