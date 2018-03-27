package hari02.logic01;

import java.util.Scanner;

import xsis.bc.util.PrintArray;

public class Logic01Soal07 {
	public static void main(String[] args) {
		System.out.println("masukkan angka");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[][] ar = new String[n][n];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if(i+j>=n-1)
					ar[i][j]="*";
				else
					ar[i][j]="";
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
