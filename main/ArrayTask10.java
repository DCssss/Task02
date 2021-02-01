package by.arraytask.java.main;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask10 {

	/*
	 * ƒан массив действительных чисел, размерность которого N. ѕодсчитать, сколько
	 * в нем отрицательных, положительных и нулевых элементов.
	 */

	public static void main(String[] args) {

		int n = 10;
		double[] ar = new double[n];
		init(ar);

		double maxSum = ar[0] + ar[ar.length - 1];
		for (int i = 1; i < ar.length / 2; i++) {
			if ((ar[i] + ar[ar.length - i - 1]) > maxSum) {
				maxSum = ar[i] + ar[ar.length - i - 1];

				System.out.println(maxSum);
				System.out.println(Arrays.toString(ar));
			}
		}

	}

	public static void init(double[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++)
			mas[i] = rand.nextInt(100);

	}

}