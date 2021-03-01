import java.util.Scanner;

public class Jungol_587 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		recursive(n);
	}

	private static void recursive(int n) {
		if(n == 0) return;
		else {
			System.out.println("recursive");
			
		}
	}
}