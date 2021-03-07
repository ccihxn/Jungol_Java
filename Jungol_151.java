import java.util.Scanner;

public class Jungol_151 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) 
			arr[i] = sr.nextInt();
		System.out.println(arr[0]+arr[2]+arr[4]);
 	}
}