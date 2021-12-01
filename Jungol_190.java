import java.util.Scanner;

public class Jungol_190 {
	public static void main(String[] args) {
		String[] array = {"flower", "rose", "lily", "daffodil", "azalea"};
		Scanner sr = new Scanner(System.in);
		String s = sr.next();
		char key = s.charAt(0);
		int count = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<=2;j++) {
				if(array[i].charAt(j) == key) {
					System.out.println(array[i]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}