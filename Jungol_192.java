import java.util.Scanner;

public class Jungol_192 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		String array[] = new String[n], answer[] = new String[n];
		for(int i=0;i<n;i++) array[i] = sr.next();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i].compareTo(array[j])>0) {
					String temp = "";
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		for(int i=0;i<n;i++) System.out.println(array[i]);
	}
}