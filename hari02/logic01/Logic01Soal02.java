package hari02.logic01;

import java.util.Scanner;

import xsis.bc.util.PrintArray;

public class Logic01Soal02 {
	public static void main(String[] args) {
		System.out.println("Masukkan angka :");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		String[][] array = new String[n][n];
		
		//mengisi array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i+j==n-1)
					array[i][j]="*";
				else
					array[i][j]="";
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
