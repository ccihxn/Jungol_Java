import java.util.Scanner;

public class Jungol_564 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] count = new int['Z'-'A'+1];
		String s = sr.next();
		char ch = s.charAt(0);
		while(ch >= 'A' && ch <= 'Z') {
			count[ch-'A']++;
			s = sr.next();
			ch = s.charAt(0);
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) {
				System.out.println((char)(i+'A')+" : "+count[i]);
			}
		}
	}
}