import java.util.Scanner;

public class Jungol_581 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int a = sr.nextInt(), b = sr.nextInt();
		double x = sr.nextDouble(), y = sr.nextDouble();
		int maxInt = Math.abs(a) > Math.abs(b) ? a : b;
		double minDouble = Math.abs(x) < Math.abs(y) ? x : y;
		System.out.println(maxInt);
		System.out.printf("%.2f", minDouble);
	}
}