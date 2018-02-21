package hari01.logic01;

public class Logic01Soal03 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j) { // miring kanan \
					System.out.print("* \t");
				} else if (j + i == 8) { // miring kiri /
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
		System.out.println("ulang ke 1");
		method1();
		System.out.println("ulang ke 2");
		method2();
		System.out.println("ulang ke 3");
		method3();
		System.out.println("ulang ke 4");
		method4();
		System.out.println("ulang ke 5");
		method5();
		System.out.println("ulang ke 6");
		method6();
		System.out.println("ulang ke 7");
		method7();
		System.out.println("ulang ke 8");
		method8();
		System.out.println("ulang ke 9");
		method9();
		System.out.println("ulang ke 10");
		method10();
	}

	public static void method1() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j)
					System.out.print("* \t");
				else if (i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method2() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j || i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method3() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j || i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method4() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j || i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method5() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j || i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method6() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j || i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method7() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8 || i == j)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method8() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i + j == 8 || i == j)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

	public static void method9() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j || i + j == 8)
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
				if (i == j || i + j == 8)
					System.out.print("* \t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
