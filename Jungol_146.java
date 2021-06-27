import java.util.Scanner;

public class Jungol_146 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), k = 0, p = 0, count = n;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i;j++) System.out.print((char)('A'+k+j)+" ");
			if(i != n-1) for(int j=0;j<n-i-1;j++) System.out.print(p++ +" ");
			
			System.out.println();
			k += count--;
		}
	}
}
public class Jungol_146 {

}
