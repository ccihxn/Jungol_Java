import java.util.Scanner;

public class Jungol_169 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String[][] arr = new String[3][5];
		char ch;
		int[][] arrChar = new int[3][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sr.next();
				ch = arr[i][j].charAt(0);
				arrChar[i][j] = (int)ch+32;
			}
		} for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print((char)arrChar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
