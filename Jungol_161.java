import java.util.Scanner;

public class Jungol_161 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] testscore = new int[100], count = new int[101];
		for(int i=0;i<testscore.length;i++) {
			testscore[i] = sr.nextInt();
			if(testscore[i] == 0) break;
			testscore[i] = testscore[i]/10*10;
			count[testscore[i]]++;
		}
		for(int i=count.length-1;i>=0;i--) {
			if(count[i] != 0) System.out.println(i+" : "+count[i]+" person");
		}
	}
}