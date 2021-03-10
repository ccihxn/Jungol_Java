import java.util.Scanner;

public class Jungol_569 {
	public static void main(String[] args) {
		int score[][]  = new int[5][4], sum[] = new int[5], count=0;
		fillScore(score);
		sumScore(score, sum);
		for(int i=0;i<sum.length;i++) {
			if(sum[i]/4. >= 80) {
				System.out.println("pass");
				count++;
			} else System.out.println("fail");
		}
		System.out.println("Successful : "+count);
	}

	private static void sumScore(int[][] score, int[] sum) {
		for(int i=0;i<score.length;i++) 
			for(int j=0;j<score[1].length;j++) sum[i] += score[i][j];
	}

	private static void fillScore(int[][] score) {
		Scanner sr = new Scanner(System.in);
		for(int i=0;i<score.length;i++) 
			for(int j=0;j<score[1].length;j++) 
				score[i][j] = sr.nextInt();
	}
}