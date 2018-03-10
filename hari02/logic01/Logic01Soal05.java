package hari02.logic01;

import java.util.Scanner;

import xsis.bc.util.PrintArray;

public class Logic01Soal05 {
	public static void main(String[] args) {
		System.out.println("masukkan angka :");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
				else
					ar[i][j] = "";
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("ulang ke 1");
		method1(n);
		System.out.println("ulang ke 2");
		method2(n);
		System.out.println("ulang ke 3");
		method3(n);
		System.out.println("ulang ke 4");
		method4(n);
		System.out.println("ulang ke 5");
		method5(n);
		System.out.println("ulang ke 6");
		method6(n);
		System.out.println("ulang ke 7");
		method7(n);
		System.out.println("ulang ke 8");
		method8(n);
		System.out.println("ulang ke 9");
		method9(n);
		System.out.println("ulang ke 10");
		method10(n);
	}

	public static void method1(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method2(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method3(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method4(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method5(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method6(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method7(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method8(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method9(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
	
	public static void method10(int n) {
		String[][] ar = new String[n][n];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1)
					ar[i][j] = "*";
			}
		}
		PrintArray.array2D(ar);
	}
}
