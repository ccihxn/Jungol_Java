import java.util.Scanner;

public class Jungol_609 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String arr[] = new String[3], temp;
		for(int i=0;i<arr.length;i++) arr[i] = sr.next();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0]);
	}
}