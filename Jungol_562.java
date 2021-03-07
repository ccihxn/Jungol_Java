import java.util.Scanner;

public class Jungol_562 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr= new int[10];
		int sum=0, sum1=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			if(i%2==1) sum += arr[i];
			else sum1 += arr[i];
		}
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f", sum1/5.);
 	}
}