import java.util.Scanner;

public class Jungol_164 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int score[][] = new int[4][3], sum[] = new int[4];
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"class? ");
			for(int j=0;j<score[i].length;j++) {
				score[i][j] = sr.nextInt();
				sum[i] += score[i][j];
			}
		}
		for(int i=0;i<sum.length;i++) System.out.println((i+1)+"class : "+sum[i]);
	}
}