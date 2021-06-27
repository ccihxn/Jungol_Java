import java.util.Scanner;

public class Jungol_143 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) System.out.print(" ");
			for(int j=(n-i)*2-1;j>0;j--) System.out.print("*"); 
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i-1;j++) System.out.print(" ");
			for(int j=0;j<=(n-i)*2;j++) System.out.print("*");
			System.out.println();
		}
	}
}