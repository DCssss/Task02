package by.arraytask.java.main;

import java.util.Random;

public class ArrayTask9 {

	/*
	 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
	 * в нем отрицательных, положительных и нулевых элементов.
	 */

	public static void main(String[] args) {

		int n = 10;
		int[] ar = new int[n];
		init(ar);

	}

	public static void init(int[] mas) {
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(19) - 4;

			if (mas[i] > 0) {
				c1++;
			}
			if (mas[i] < 0) {
				c2++;

			}
			if (mas[i] == 0) {
				c3++;

			}

			System.out.print(mas[i] + " ");

		}
		System.out.println();
		System.out.println("положительных = " + c1);
		System.out.println("отрицательных = " + c2);
		System.out.println("нулевых = " + c3);
	}
}