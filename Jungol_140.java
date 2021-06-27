import java.util.Scanner;

public class Jungol_140 {
	public static void main(String[] args) {
		Scanner sr = new Scanner (System.in);
		int[] n = new int[20];
		int i = 0, sum = 0 ,avg = 0;
		
		while(i != 20) {
			n[i] = sr.nextInt();
			if(n[i] == 0) break;
			sum += n[i];
			i++;
		}
		avg = (int)(sum/(double)i);
		System.out.println(sum+" "+avg);
	}
}