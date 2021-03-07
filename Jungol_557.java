import java.util.Scanner;

public class Jungol_557 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		char[] arr = new char[10];
		for(int i=0; i<arr.length;i++) {
			String s = sr.next();
			arr[i] = s.charAt(0);
		} System.out.println(arr[0]+" "+ arr[3]+" "+arr[6]);
	}
}