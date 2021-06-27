import java.util.Scanner;

public class Jungol_144 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=0;j<i-1;j++) System.out.print(" ");
			for(int j=0;j<i-1;j++) System.out.print(" ");
			for(int j=0;j<=(n-i)*2;j++) System.out.print("*");
			System.out.println();
		}
	}
}