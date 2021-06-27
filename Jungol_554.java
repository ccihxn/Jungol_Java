import java.util.Scanner;

public class Jungol_554 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), k = 0, p = 0;
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(j+k+1+" ");
			}
			for(int j=0;j<n-i+1;j++) {
				System.out.print((char)('A'+p+j)+" ");
			}
			k += i;
			p += n-i+1;
			System.out.println();
		}
	}
}