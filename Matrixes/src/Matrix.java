
public class Matrix {

	public static void main(String[] args) {
		int arrayA[][] = {
				{5, 4, 13, 8, 7, 0},
				{8, 6, 7, 21, 1, 0},
				{3, 34, 5, 6, 2, 4},
				{7, 7, 3, 12, 9, 2},
				{11, 8, 1, 1, 2, 3}
	};
		int arrayB[][] = {
				{3, 4, 1, 8},
				{2, 5, 4, 3},
				{7, 5, 3, 2},
				{4, 4, 1, 6},
				{2, 2, 1, 0},
				{1, 8, 9, 7}				
		};
		int arrayC[][] = new int[5][4];
		int i, j, a, k;
		int sum;
		
		for (i = 0; i < 5; i++) {
			for (k = 0; k < 4; k++) {
				for (j = 0, a = 0, sum = 0; j < 6; j++, a++) {
					sum += arrayA[i][j] * arrayB[a][k];
				}
				arrayC[i][k] = sum;
			}
		}
		for (i = 0; i < 5; i++) {
			for (k = 0; k < 4; k++) {
				System.out.print(arrayC[i][k] + " ");
				if ((k + 1) % 4 == 0)
					System.out.println();
				
			}
		}
	}
}
