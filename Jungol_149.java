import java.util.Scanner;

public class Jungol_149 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), k = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(k+" ");
				k += 2;
				k %= 10;
			}
			System.out.println();
		}
	}
}