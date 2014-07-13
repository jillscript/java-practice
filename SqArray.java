//jill lynch 0403228

//to print array as string
import java.util.Arrays;

public class SqArray {
	public static double[][] multiply(double a[][], double b[][]) {
		double productarray[][] = new double[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				productarray[i][j] += a[i][j] * b[i][j];
			}
		}
		return productarray;
	}


	public static void main(String[] args) {
		double[][] a = { { 4.00, 3.00 }, { 2.00, 1.00 } };
		double[][] b = { { -0.500, 1.500 }, { 1.000, -2.0000 } };
		
		//when the number of rows in the first matrix is equal to columns in second matrix
		if (a.length == b[0].length) {
			multiply(a, b);
			System.out.println(Arrays.deepToString(multiply(a, b)));
		}
	}
}
