import java.util.Scanner;

public class Jungol_152 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[10], odd=0, even=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			if(i % 2 == 0) odd += arr[i];
			else even += arr[i];
		}
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);
 	}
}