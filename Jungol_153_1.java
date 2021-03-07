import java.util.Scanner;

public class Jungol_153_1 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[100], k=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sr.nextInt();
			if(arr[i] == -1) break;
			k++;
		} if(k<3) for(int i=0;i<=k-1;i++) System.out.print(arr[i]+" ");
		else for(int i=k-3;i<k;i++) System.out.print(arr[i]+" ");
 	}
}