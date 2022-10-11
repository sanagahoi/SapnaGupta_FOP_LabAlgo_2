package com.gl.fsdDsa.Traveller;

public class Sort {
	//l for left and r for right
	public void sort(int[] denomination, int l, int r) {
		if (l < r) {
			//the middle point
			int mid = (l + r) / 2;
			// array in two halves
			sort(denomination, l , mid);
			sort(denomination, mid + 1, r);
			// Merge values
			merge(denomination, l, mid, r);
		}
	}
	
	void merge(int arr[], int l, int mid, int r) {
		// size of sub array
		int size1 = mid - l + 1;
		int size2 = r - mid;
		
		int templeft[] = new int[size1];
		int tempright[] = new int[size2];
		
		for (int i = 0; i < size1; ++i)
			templeft[i] = arr[l + i];
		for (int j = 0; j < size2; ++j)
			tempright[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = l;
		while (i < size1 && j < size2) {
			if (templeft[i] >= tempright[j]) {
				arr[k] = templeft[i];
				i++;
			} else {
				arr[k] = tempright[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			arr[k] = templeft[i];
			i++;
			k++;
		}

		while (j < size2) {
			arr[k] = tempright[j];
			j++;
			k++;
		}
	}
}

