package com.gl.fsdDsa.Traveller;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//sort denominations
		
		Sort sorting = new Sort();
		
		DenominationCalculator dc = new DenominationCalculator();
		
		System.out.println("enter the size of currency denominations");
		int num_currency = scanner.nextInt();
		int[] notes = new int[num_currency];
		
		//Get currency denominations value
		
		System.out.println("Enter the currency Denominations value");
		for(int i=0; i<num_currency; i++) {
			notes[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay : ");
		int amount = scanner.nextInt();
		
		sorting.sort(notes, 0, notes.length-1);
		
		dc.denominationCalculator(notes,  amount);

		scanner.close();
	}
}


