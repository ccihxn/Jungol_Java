import java.util.Scanner;

public class Jungol_553 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int k = 0;
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print((char)('A'+k+j));
			}
			k += i;
			System.out.println();
		}
	}
}