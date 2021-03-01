import java.util.Scanner;

public class Jungol_588 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		output(n);
	}

	private static void output(int n) {
		if(n == 0) return;
		else {
			System.out.print(n+" ");
			output(n-1);
		}
	}
}