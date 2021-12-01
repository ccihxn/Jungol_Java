import java.util.Scanner;

public class Jungol_193 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String array[] = new String[5], answer[] = new String[5];
		for(int i=0;i<array.length;i++) array[i]=sr.next();
		String c = sr.next(), s = sr.next();
		int count = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i].contains(c)||array[i].contains(s)) {
				answer[count++] = array[i];
			}
		}
		if(answer[0] == null) System.out.println("none");
		for(int i=0;i<answer.length;i++) {
			if(answer[i] == null) return;
			System.out.println(answer[i]);
		}
	}
}