public class Jungol_165 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		arr[0][0] = 1; arr[0][2] = 1; arr[0][4] = 1;
		System.out.println("1 0 1 0 1");
		for(int i=1;i<arr.length;i++) {
			if(i % 2 == 1) {
				for(int j=1; j<arr[i].length;j+=2) {
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j+1];
				}
			} else {
				arr[i][0] = arr[i-1][1];
				arr[i][2] = arr[i-1][1]+arr[i-1][3];
				arr[i][4] = arr[i-1][3];
			}
			for(int j=0;j<arr[i].length;j++) System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}