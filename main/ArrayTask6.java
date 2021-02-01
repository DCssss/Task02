package by.arraytask.java.main;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask6 {

	public static void main(String[] args) {

		int n = 10;
		int[] ar = new int[n];
		init(ar);

	}

	public static void init(int[] mas) {

		Random rand = new Random();
		int c = 0;
		int z = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Z = ");
		z = in.nextInt();
		in.close();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);

			if (mas[i] > z) {
				mas[i] = z;
				c = c + 1;
			}
			System.out.print(mas[i] + " ");

		}
		System.out.println();
		System.out.println("Количество замен " + c);
	}
}