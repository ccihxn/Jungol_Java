import java.util.Arrays;
import java.util.Scanner;

public class Jungol_175 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length;i++) arr[i] = sr.nextInt();
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) System.out.print(arr[i]+" ");
	}
}