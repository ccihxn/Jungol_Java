import java.util.Scanner;

public class Jungol_1641 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), m = sr.nextInt();
		int[][] arr = new int[n][n];
		int k = 1;
		if(n >= 100 || n < 1 || n % 2 == 0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		if (m == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					arr[i][j] = k++;
				}
			}
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0)
					for (int j = 0; j <= i; j++)
						System.out.print(arr[i][j] + " ");
				else
					for (int j = i; j >= 0; j--)
						System.out.print(arr[i][j] + " ");

				System.out.println();
			}
		} else if(m == 2) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<i*2;j++) System.out.print(" ");
				for(int j=1;j<(n-i)*2;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		} else if(m == 3) {
			for(int i=0;i<n;i++) {
				if(i<=n/2) {
					for(int j=0;j<=i;j++) {
						System.out.print(j+1+" ");
					}
				} else {
					for(int j=0;j<n-i;j++) {
						System.out.print(j+1+" ");
					}
				}
				System.out.println();
			}
		} else System.out.println("INPUT ERROR!");
	}
}