import java.util.Scanner;

public class Jungol_168 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int[][] pascal = new int[n][n];
		for(int i=0;i<pascal.length;i++) 
			for(int j=0;j<=i;j++) {
				if(j == 0 || i == j) pascal[i][j] = 1;
				else pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
			}
		for(int i=pascal.length-1; i>=0; i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(pascal[i][j]+" ");
			}
			System.out.println();
		}
	}
}