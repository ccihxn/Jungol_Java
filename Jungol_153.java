import java.util.Scanner;

public class Jungol_153 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[100], i=0;
		while(true) {
			arr[i] = sr.nextInt();
			if(arr[i] == -1) break;
			i++;
		}
		int end = i-2, n[] = new int[3], k=0;
		while(i>=end && i > 0) {
			n[k++] = arr[--i];
		}
		for(int j=n.length-1;j>=0;j--) 
			if(n[j] != 0) System.out.print(n[j]+" ");
 	}
}