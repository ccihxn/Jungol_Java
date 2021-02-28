import java.util.Scanner;

public class Jungol_176 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		double a = sr.nextDouble(), b = sr.nextDouble();
		a = Math.sqrt(a); b = Math.sqrt(b);
		int small = a<b? (int)Math.ceil(a) : (int)Math.ceil(b);
		int max = a>b? (int)Math.floor(a):(int)Math.floor(b);
		int count = 0;
		for(int i=small;i<=max;i++) count++;
		System.out.println(count);
	}
}