package by.arraytask.java.main;

import java.util.Random;

public class ArrayTask4 {

	public static void main(String[] args) {

		int n = 10;
		int[] ar = new int[n];
		init(ar);

	}

	public static void init(int[] mas) {

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			// System.out.print(mas[i] + " ");
			if (mas[i] % 2 == 0) {
				int[] result = new int[mas.length];
				result[i] = mas[i];
				System.out.println(result[i] + " ");
			}

		}

	}
}