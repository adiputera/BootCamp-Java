package hari02.logic01;

import java.util.Scanner;

import xsis.bc.util.PrintArray;

public class Logic01Soal01 {
	public static void main(String[] args) {
		System.out.println("Masukkan Angka : ");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		String[][] array2D = new String[n][n];
		
		// mengisi array
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if(i==j) {
					array2D[i][j]="*";
				}
				else {
					array2D[i][j]="";
				}
			}
		}
		
		//menampilkan array
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + "\t");
			}
			
			System.out.println("\n");
		}
	}
}
