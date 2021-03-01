import java.util.Scanner;

public class Jungol_589 { 
	public static int sum = 0;
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		sum(n);
		System.out.println(sum);
	}

	private static void sum(int n) {
		if(n == 0) return;
		else {
			sum += n;
			sum(n-1);
		}
	}
}