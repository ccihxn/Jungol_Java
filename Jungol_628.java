import java.util.Scanner;

public class Jungol_628 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = 10;
		String[] name = new String[n];
		int[] score = new int[n], rank = new int[n];
		for(int i=0;i<n;i++) {
			name[i] = sr.next();
			score[i] = sr.nextInt();
		}
		rankScore(score, rank, n);
		System.out.println("Name Score Rank");
		for(int i=0;i<n;i++) {
			System.out.printf("%4s %5d %4d\n", name[i], score[i], rank[i]);
		}
	}

	private static void rankScore(int[] score,int[] rank, int n) {
		for(int i=0;i<n;i++) {
			int k = score[i], rankCount = 0;
			for(int j=0;j<n;j++) {
				if(i == j) continue;
				if(k<score[j]) rankCount++;
			}
			rank[i] = rankCount+1;
		}
	}
}
public class Jungol_628 {

}
