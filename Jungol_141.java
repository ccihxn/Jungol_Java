import java.util.Scanner;

public class Jungol_141 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int i = 1;
		while(n*i < 100) {
			System.out.print(n*i+" ");
			if((n*i) % 10 == 0) break;
			i++;
		}
	}
	
}