import java.util.Scanner;

public class Jungol_558 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			if(arr[i] == 0) break;
		}
		for(int i=arr.length-1;i>-1;i--) {
			if(arr[i] != 0) System.out.print(arr[i]+" ");
		}
	}
}