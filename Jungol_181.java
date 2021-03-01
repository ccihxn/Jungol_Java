import java.util.Scanner;

public class Jungol_181 {
	public static final double PI = 3.141592;
	public static double area(double r) {return r*r*PI;} 
	public static void main(String[] args) {
		System.out.print("radius : ");
		Scanner sr = new Scanner(System.in);
		double r = sr.nextDouble();
		System.out.printf("area = %.3f", area(r));
	}
}