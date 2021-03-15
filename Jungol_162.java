import java.util.Scanner;

public class Jungol_162 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(), m = sr.nextInt(), arr[] = new int[10];
		arr[0] = n; arr[1] = m;
		System.out.print(n+" "+m+" ");
		for(int i=2;i<arr.length;i++) {
			arr[i] = arr[i-2] + arr[i-1];
			if(arr[i] >= 10) arr[i] %= 10;
			System.out.print(arr[i]+" ");
		}
	}
}