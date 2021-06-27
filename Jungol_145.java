import java.util.Scanner;

public class Jungol_145 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=n-1;j>i;j--) System.out.print("  ");
			for(int j=0;j<=i;j++) System.out.print(j+1+" ");
			System.out.println();
		}
	}
}