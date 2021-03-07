import java.util.Scanner;

public class Jungol_559 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		double[] classavg = new double[6];
		classavg[0] = 85.6;
		classavg[1] = 79.5;
		classavg[2] = 83.1;
		classavg[3] = 80.0;
		classavg[4] = 78.2;
		classavg[5] = 75.0;
		int a = sr.nextInt(), b = sr.nextInt();
		System.out.printf("%.1f", classavg[a-1]+classavg[b-1]);
	}
}