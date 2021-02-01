package by.arraytask.java.main;

public class ArrayTask2 {

	public static void main(String[] args) {

		int[] ar = { 0, 0, 2, 5, 6, 0 };

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == 0) {

				int result[] = { i };
				System.out.println(result + " ");
			}

		}

	}

}
