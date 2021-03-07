import java.util.Scanner;

public class Jungol_561 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) arr[i] = sr.nextInt();
		int max = 0, min = 10001;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<100) {
				if(arr[i]>max) max = arr[i];
			}
			else
				if(arr[i]<min) min = arr[i];
		}
		if(max == 0) max = 100;
		if(min == 10001) min = 100;
		System.out.println(max+" "+min);
 	}
}