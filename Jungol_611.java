import java.util.Scanner;

public class Jungol_611 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String s = sr.nextLine();
		String n = "", f = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') n += s.charAt(i);
			else break;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') f += s.charAt(i);
			else if(s.charAt(i)=='.') {
				if(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9') f += s.charAt(i);
				else break;
			}
			else break;
		}
		System.out.println(Integer.parseInt(n)*2);
		System.out.printf("%.2f", Double.parseDouble(f));
	}
}