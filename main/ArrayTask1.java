package by.arraytask.java.main;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите K = ");
		k = sc.nextInt();
		sc.close();

		Random rand = new Random();
		int n = 10;
		int[] ar = new int[n];
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
			System.out.print(ar[i] + " ");
			if (ar[i] % k == 0) {
				sum = sum + ar[i];
			}

		}
		System.out.println("Sum = " + sum);
	}
}