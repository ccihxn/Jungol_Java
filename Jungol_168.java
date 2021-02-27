import java.util.Scanner;

public class Jungol_168 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n=sr.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==j || j == 0) arr[i][j] = 1;
				else arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
