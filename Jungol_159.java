import java.util.Arrays;
import java.util.Scanner;

public class Jungol_159 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int[] point = new int[n];
		for(int i=0;i<point.length;i++) point[i] = sr.nextInt();
		Arrays.parallelSort(point);
		for(int i=point.length-1;i>=0;i--) System.out.println(point[i]);
	}
}