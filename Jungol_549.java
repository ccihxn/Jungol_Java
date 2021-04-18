import java.util.Scanner;

public class Jungol_549 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), sum = 0, i = 1, count = 0;
		while(sum < n) {
			sum += i;
			i += 2;
			count++;
		}
		System.out.println(count+" "+sum);
	}
}