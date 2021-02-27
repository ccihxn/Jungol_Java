import java.util.Scanner;

public class Jungol_583 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		double a = sr.nextDouble(), b = sr.nextDouble(), c = sr.nextDouble();
		double max2 = b > c ? b : c;
		double max = a > max2 ? a: max2;
		double min2 = b < c ? b : c;
		double min = a < min2 ? a : min2;
		double round;
		if(a != max && a != min) round = a;
		else if(b != max && b != min) round = b;
		else round = c;
		max = Math.ceil(max);
		min = Math.floor(min);
		round = Math.round(round);
		System.out.println((int)max+" "+(int)min+" "+(int)round);
	}
}