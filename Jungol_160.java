import java.util.Scanner;

public class Jungol_160 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[10], count = new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			count[arr[i]]++;
		}
		for(int i=1;i<7;i++) {
			System.out.println(i+" : "+count[i]);
		}
	}
}