import java.util.Scanner;

public class Jungol_566 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), arr[] = new int[100], i = 1;
		arr[0] = 100;
		arr[1] = n;
		System.out.print(arr[0]+" "+arr[1]+" ");
		while(arr[i] >= 0) {
			i++;
			arr[i] = arr[i-2]-arr[i-1];
			System.out.print(arr[i]+" ");
		}
		
	}
}