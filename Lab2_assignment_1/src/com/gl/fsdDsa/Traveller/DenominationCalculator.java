package com.gl.fsdDsa.Traveller;

public class DenominationCalculator {
	
	public void denominationCalculator(int denomination[], int amount) {
		int[] num_notes = new int[denomination.length];
		
			for (int i = 0; i <= denomination.length -1; i++) {
				if (amount >= denomination[i]) {
					num_notes[i] = amount / denomination[i];
					amount = amount %  denomination[i];
				}
			}
			
			if(amount > 0) {
				System.out.println("higher denomination isn't available.");	
			}else {
				System.out.println("Your payment approach in order to give minimum no of notes ");
       
				for (int i = 0; i < denomination.length; i++) {
					if (num_notes[i] != 0) {
						System.out.println(denomination[i] + " : " + num_notes[i]);
					}
				}
			}
		}
	}



