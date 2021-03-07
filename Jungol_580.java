import java.util.Scanner;

public class Jungol_580 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int month = sr.nextInt(), day = sr.nextInt();
		if(month == 2) {
			if(day >= 1 && day <= 29) System.out.println("OK!");
			else System.out.println("BAD!");
		} else if(month >= 1 && month <= 7) {
			if(month % 2 == 1) {
				if(day >= 1 && day <= 31) System.out.println("OK!");
				else System.out.println("BAD!");
			} else {
				if(day >= 1 && day <= 30) System.out.println("OK!");
				else System.out.println("BAD!");
			}
		} else if(month >= 8 && month <= 12) {
			if(month % 2 == 1) {
				if(day >= 1 && day <= 30) System.out.println("OK!");
				else System.out.println("BAD!");
			} else {
				if(day >= 1 && day <= 31) System.out.println("OK!");
				else System.out.println("BAD!");
			}
		} else System.out.println("BAD!");
	}
}