import java.util.Scanner;

public class Jungol_157 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[100], multiples = 0, sum=0, count=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sr.nextInt();
			if(arr[i] == 0) break;
			if(arr[i]%5 == 0) {
				multiples++;
				sum += arr[i];
				count++;
			}
		}
		System.out.println("Multiples of 5 : "+multiples);
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f", sum/(double)count);
	}
}