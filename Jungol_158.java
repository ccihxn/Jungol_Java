import java.util.Scanner;

public class Jungol_158 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[100], count = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			if(arr[i] == 0) break;
			if(arr[i] % 2 == 0) arr[i] /= 2;
			else arr[i] *=2;
			count++;
		}
		System.out.println(count);
		for(int i=0;i<count;i++) System.out.print(arr[i]+" ");
	}
}