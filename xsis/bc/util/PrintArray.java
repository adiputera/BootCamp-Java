package xsis.bc.util;

public class PrintArray {
	public static void array2D(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] != null)
					System.out.print(array[i][j] + "\t");
				else
					System.out.print(" \t");
			}
			System.out.println("\n");
		}
	}
}
