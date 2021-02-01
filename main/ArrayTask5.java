package by.arraytask.java.main;

import java.util.Arrays;
import java.util.Random;

//Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

public class ArrayTask5 {

	public static void main(String args[]) {

		int n = 5;
		int min = 0;

		int[] ar = new int[n];
		init(ar);
		System.out.println(Arrays.toString(ar));

		if (ar.length == 1) {
			min = ar[0];
		}
		if (ar.length > 1) {
			min = ar[1] - ar[0];
		}

		System.out.println(min);
	}

	public static void init(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++)
			mas[i] = rand.nextInt(20);
		Arrays.sort(mas);

	}

}