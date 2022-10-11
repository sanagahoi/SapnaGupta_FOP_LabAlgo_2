package com.glFsd.dsa.targetachieve;

import java.util.Scanner;



/*PayMoney processes thousands of transactions daily amounting to crores of Rupees. 
  They also have a daily target that they must achieve.
  Given a list of transactions done by PayMoney and a daily target,
  your task is to determine at which transaction PayMoney achieves the same.
  If the target is not achievable, then display the target is not achieved.
 */
public class PayMoney {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		TargetMonitor tm = new TargetMonitor();

		System.out.println("Enter the size of transaction array");
		int noOfTransactions = sc.nextInt();
		int totalTransaction[] = new int[noOfTransactions];

		System.out.println("Enter the values of array");
		for (int i = 0; i < noOfTransactions; i++)
			totalTransaction[i] = sc.nextInt();

		System.out.println("Enter the total number of targets that needs to be achieved");
		int Num_target = sc.nextInt();

		int targetValue;
		System.out.println("Enter the value of target");

		int[] value = new int[noOfTransactions];
		value[0] = totalTransaction[0];

		for (int i = 1; i < noOfTransactions; i++)
			value[i] = value[i - 1] + totalTransaction[i];

		for (int i = 0; i < Num_target; i++) {
			targetValue = sc.nextInt();

			tm.getTarget(value, targetValue);
		}

	}
}
