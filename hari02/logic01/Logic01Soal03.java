package hari02.logic01;

import java.util.Scanner;

import xsis.bc.util.PrintArray;

public class Logic01Soal03 {
	public static void main(String[] args) {
		System.out.println("Masukkan angka :");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
				else
					array[i][j]="";
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
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
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method2(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method3(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method4(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method5(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method6(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method7(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method8(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method9(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
	
	public static void method10(int n) {
		String[][] array = new String[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j || i+j==n-1)
					array[i][j]="*";
			}
		}
		PrintArray.array2D(array);
	}
}
