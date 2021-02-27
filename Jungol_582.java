import java.util.Scanner;

public class Jungol_582 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int area = sr.nextInt();
		double r = Math.sqrt(area/3.14);
		System.out.printf("%.2f", r);
	}
}