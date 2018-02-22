package xsis.bc.util;

public class Deret {
	public static int[] fibonacci(int n) {
		int[] deret = new int[n];
		for (int i = 0; i < deret.length; i++) {
			if (i < 2) {
				deret[i] = 1;
			} else {
				deret[i] = deret[i - 1] + deret[i - 2];
			}
		}
		return deret;
	}

	public static int[] tribonacci(int n) {
		int[] deret = new int[n];
		for (int i = 0; i < deret.length; i++) {
			if (i < 3) {
				deret[i] = 1;
			} else {
				deret[i] = deret[i - 1] + deret[i - 2] + deret[3];
			}
		}
		return deret;
	}

	public static String[] arrayHuruf() {
		String[] deret = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		return deret;
	}

	public static int[] deretTambah1(int n) {
		int[] deret = new int[n];
		deret[0] = 0;
		for (int i = 1; i < deret.length; i++) {
			deret[i] = deret[i - 1] + 1;
		}
		return deret;
	}

	public static int[] genap(int n) {
		int[] deret = new int[n];
		deret[0] = 0;
		for (int i = 1; i < deret.length; i++) {
			deret[i] = deret[i - 1] + 2;
		}
		return deret;
	}
	
	public static int[] ganjil(int n) {
		int[] deret = new int[n];
		deret[0] = 1;
		for (int i = 1; i < deret.length; i++) {
			deret[i] = deret[i - 1] + 2;
		}
		return deret;
	}
	
	public static int[] deretKali2(int n) {
		int[] deret = new int[n];
		deret[0] = 2;
		for (int i = 1; i < deret.length; i++) {
			deret[i] = deret[i-1]*2;
		}
		return deret;
	}
	
	public static int triangular(int n) {
		int hasil = 0;
		for (int i = 0; i <= n; i++) {
			hasil+=i;
		}
		return hasil;
	}
	
	public static int[] triangularArray(int n) {
		int[] hasil = new int[n];
		hasil[0] = 0;
		for (int i = 1; i <= n; i++) {
			hasil[i] = hasil[i-1]+i;
		}
		return hasil;
	}
}
