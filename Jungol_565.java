import java.util.Scanner;

public class Jungol_565 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), count[] = new int[10];
		while(n != 0) {
			n/=10;
			count[n]++;
			n = sr.nextInt();
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) System.out.println(i+" : "+count[i]);
		}
	}
}