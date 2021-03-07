import java.util.Scanner;

public class Jungol_560 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) arr[i] = sr.nextInt();
		int min = arr[0];
		for(int i=1;i<arr.length;i++) 
			if(arr[i] < min) min = arr[i];
		System.out.println(min);
 	}
}