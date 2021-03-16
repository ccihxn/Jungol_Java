import java.util.Scanner;

public class Jungol_529 {
	public static void main(String[] args) { 
		Scanner sr = new Scanner(System.in);
		int height = sr.nextInt(), weight = sr.nextInt(), obesity = weight+100-height;
		System.out.println(obesity);
		if(obesity > 0) System.out.println("Obesity");
	}
}