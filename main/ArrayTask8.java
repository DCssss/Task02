package by.arraytask.java.main;

import java.util.Random;


public class ArrayTask8 {

	public static void main(String[] args) {

		int n = 10;
		int[] ar = new int[n];
		init(ar);

	}

	public static void init(int[] mas) {

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(19) - 1;

			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}
		}

	}
}