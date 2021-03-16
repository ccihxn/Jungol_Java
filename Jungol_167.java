import java.util.Scanner;

public class Jungol_167 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[][] = new int[4][2], widthavg[] = new int[4], heightavg[] = new int[2], avg = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sr.nextInt();
				widthavg[i] += arr[i][j];
				heightavg[j] += arr[i][j];
				avg += arr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			widthavg[i] /= arr[i].length;
			System.out.print(widthavg[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr[0].length;i++) {
			heightavg[i] /= arr.length;
			System.out.print(heightavg[i]+" ");
		}
		System.out.println();
		avg /= arr.length*arr[0].length;
		System.out.println(avg);
	}
}