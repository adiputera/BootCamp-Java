package hari01.logic01;

public class Logic01Soal02 {
	public static void main(String[] args) {
		// loop baris
		for (int i = 9; i > 0; i--) {
			// loop kolom, berlawanan dengan i agar yang terakhir di kiri
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					System.out.print("* \t"); // * + tab
				}
				System.out.print("\t"); // * tab
			}
			System.out.println("\n"); // baris baru
		}
		System.out.println("ulang ke 1");
		method01();
		System.out.println("ulang ke 2");
		method02();
		System.out.println("ulang ke 3");
		method03();
		System.out.println("ulang ke 4");
		method04();
		System.out.println("ulang ke 5");
		method05();
		System.out.println("ulang ke 6");
		method06();
		System.out.println("ulang ke 7");
		method07();
		System.out.println("ulang ke 8");
		method08();
		System.out.println("ulang ke 9");
		method09();
		System.out.println("ulang ke 10");
		method10();
	}

	public static void method01() {
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}

	public static void method02() {
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j < 10; j++) {
				if (i == j)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method03() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method04() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method05() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method06() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method07() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method08() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method09() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method10() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
