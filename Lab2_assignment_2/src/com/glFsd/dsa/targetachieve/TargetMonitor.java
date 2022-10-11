package com.glFsd.dsa.targetachieve;

public class TargetMonitor {

	public void getTarget(int[] value, int target) {
		int flag = 0;
		
		for (int i = 0; i < value.length; i++) {

			if (value[i] >= target) {

				System.out.println("Target achieved after " + (i + 1) + " transactions ");
				System.out.println("Enter the value of target");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Given target is not achieved ");
			
		}
	}
}