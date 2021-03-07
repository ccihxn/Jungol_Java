import java.util.Arrays;
import java.util.Scanner;

public class Jungol_563 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) arr[i] = sr.nextInt();
		Arrays.parallelSort(arr);
		for(int i=arr.length-1;i>=0;i--) System.out.print(arr[i]+" ");
 	}
}