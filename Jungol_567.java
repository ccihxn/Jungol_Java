public class Jungol_567 {
	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		fillarr(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d   ", arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void fillarr(int[][] arr) {
		arr[0][0] = 5;
		arr[0][1] = 8;
		arr[0][2] = 10;
		arr[0][3] = 6;
		arr[0][4] = 4;
		arr[1][0] = 11;
		arr[1][1] = 20;
		arr[1][2] = 1;
		arr[1][3] = 13;
		arr[1][4] = 2;
		arr[2][0] = 7;
		arr[2][1] = 9;
		arr[2][2] = 14;
		arr[2][3] = 22;
		arr[2][4] = 3;
	}
}