package com.lerangit;

public class First {
	public static void sortArray(int arr[]) {
		int minIndex = -1;
		for(int i =0; i<arr.length-1; i++) {
			int min = arr[i];
			boolean flag = false;
			for(int j =i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					minIndex = j;
					min = arr[j];
					flag = true;
				}
			}
			if(flag) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}	
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void reverseString(String s) {
		
	}

	public static void main(String[] args) {
		int arr[]= {1};
		sortArray(arr);
	}

}
