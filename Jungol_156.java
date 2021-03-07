import java.util.Scanner;

public class Jungol_156 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[100];
		arr[0] = sr.nextInt();
		int max = arr[0], min = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			if(arr[i] == 999) break;
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}
}