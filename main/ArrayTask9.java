package by.arraytask.java.main;

import java.util.Random;

public class ArrayTask9 {

	/*
	 * ��� ������ �������������� �����, ����������� �������� N. ����������, �������
	 * � ��� �������������, ������������� � ������� ���������.
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
		System.out.println("������������� = " + c1);
		System.out.println("������������� = " + c2);
		System.out.println("������� = " + c3);
	}
}