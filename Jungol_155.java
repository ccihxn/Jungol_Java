import java.util.Scanner;

public class Jungol_155 { 
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String s = "JUNGOL";
		char[] arr = s.toCharArray();
		char a = sr.next().charAt(0);
		for(int i=0;i<arr.length;i++) 
			if(a == arr[i]) {
				System.out.println(i);
				return;
			}
		System.out.println("none");
	}
}