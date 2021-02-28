import java.util.Scanner;

public class Jungol_585 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sr.nextInt();
		bubble(arr);
	}
	
	public static void bubble(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			for (int num = 0; num < arr.length; num++) {
				System.out.print(arr[num] + " ");
			}
			System.out.println();
		}

	}
}