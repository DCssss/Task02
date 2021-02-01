package by.arraytask.java.main;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

import java.util.Arrays;
import java.util.Random;

public class ArrayTask7 {

	public static void main(String[] args) {

		int n = 10;
		int[] ar = new int[n];
		init(ar);

		System.out.println(Arrays.toString(ar));

	}

	public static void init(int[] mas) {
		int t = 0;
		int imin = 0;
		int imax = 0;
		int min;
		int max;
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			min = mas[0];
			max = mas[0];
			if (mas[i] < min) {
				imin = i;
			}

			if (mas[i] > max) {
				imax = i;

			}
			t = mas[imax];
			mas[imax] = mas[imin];
			mas[imin] = t;

		}

	}
}