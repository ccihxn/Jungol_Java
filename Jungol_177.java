import java.util.Scanner;

public class Jungol_177 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[5], sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			arr[i] = Math.abs(arr[i]);
			sum += arr[i];
		}
		System.out.println(sum);
	}
}