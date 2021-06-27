import java.util.Scanner;

public class Jungol_147 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), k = 1;
		for(int i=n-1;i>=0;i--) {
			for(int j=n-2;j>=i;j--) System.out.print("  ");
			for(int j=0;j<=i;j++) System.out.print(k++ +" ");
			System.out.println();
		}
	}
}