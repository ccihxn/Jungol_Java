import java.util.Scanner;

public class Jungol_150 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		char[] arr = new char[10];
		for(int i=0;i<arr.length;i++) {
			String s=sr.next();
			arr[i] = s.charAt(0);
		}
		for(int i=arr.length-1;i>=0;i--) System.out.print(arr[i]+" ");
 	}
}