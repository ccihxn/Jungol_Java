public class Jungol_163 {
	public static void main(String[] args) {
		int[][] arr= new int[4][3];
		int sum =0;
		fillArr(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}

	private static void fillArr(int[][] arr) {
		arr[0][0] = 3;
		arr[0][1] = 5;
		arr[0][2] = 9;
		arr[1][0] = 2;
		arr[1][1] = 11;
		arr[1][2] = 5;
		arr[2][0] = 8;
		arr[2][1] = 30;
		arr[2][2] = 10;
		arr[3][0] = 22;
		arr[3][1] = 5;
		arr[3][2] = 1;
	}
}