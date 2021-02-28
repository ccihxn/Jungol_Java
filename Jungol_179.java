import java.util.Scanner;

public class Jungol_179 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		double a = sr.nextDouble(), b = sr.nextDouble(), c = sr.nextDouble(), avg = (a+b+c)/3.;
		long around = Math.round(a), bround= Math.round(b), cround = Math.round(c), roundavg = Math.round((around+bround+cround) / 3.);
		System.out.println((int)Math.round(avg));
		System.out.println(roundavg);
	}
}