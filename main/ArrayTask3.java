package by.arraytask.java.main;

public class ArrayTask3 {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < ar.length - 1; i++) {

			if (ar[i] >= ar[i + 1]) {
				System.out.println(" Не Возрастает");

			} else
				System.out.println("возрастает");

		}

	}

}
