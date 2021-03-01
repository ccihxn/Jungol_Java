import java.util.Scanner;

public class Jungol_589_1 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		System.out.println(sum(n));
	}
	private static int sum(int n) {
		if(n == 0) return 0;
		else {
			return n+sum(n-1);
		}
	}
}