import java.util.Scanner;

public class Jungol_612 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String s = sr.nextLine();
		s = s.replaceAll("\\s+", "");
		for(int i=0;i<s.length()/3+1;i++) {
			for(int j=0;j<3;j++) {
				if(i*3+j<s.length()) System.out.print(s.charAt(i*3+j));
				else break;
			}
			System.out.println();
		}
	}
}
