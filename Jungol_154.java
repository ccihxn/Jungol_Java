import java.util.Scanner;

public class Jungol_154 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		double weight[] = new double[6], sum = 0;
		for(int i=0;i<weight.length;i++) {
			weight[i] = sr.nextDouble();
			sum += weight[i];
		}
		System.out.printf("%.1f", sum/6);
	}
}