import java.util.Scanner;

public class Jungol_166 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[][] arr1 = new int[2][3], arr2 = new int[2][3], multiplearr = new int[2][3];
		System.out.println("first array");
		for(int i=0;i<arr1.length;i++) 
			for(int j=0;j<arr1[i].length;j++) arr1[i][j] = sr.nextInt();
		System.out.println("second array");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = sr.nextInt();
				multiplearr[i][j] = arr1[i][j]*arr2[i][j];
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) 
				System.out.print(multiplearr[i][j]+" ");
			
			System.out.println();
		}
		
	}
}