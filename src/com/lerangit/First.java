package com.lerangit;

//import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class First {
	public static void sortArray(int arr[]) {
		int minIndex = -1;
		for(int i =0; i<arr.length-1; i++) {
			int min = arr[i];
			boolean flag = false;
			for(int j =i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
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
	public static int[] mergSort(int arr[], int n) {
		if(arr.length == 1) {
			return arr ;
		}
		int mid = 1 + (n -1)/2;
		System.out.println("mid "+mid);
		int left[] = new int[mid];
		int right[] = new int[n - left.length] ;
		for(int i =0; i<mid; i++) {
			left[i] = arr[i];
		}
		int k=0;
		for(int j =mid; j<arr.length; j++) {
			right[k++] = arr[j];
		}
		mergSort(left,left.length);
		mergSort(right, right.length);
		return merge(left, right);
		
	}
	public static int[] merge(int a[], int b[]) {
		int merg[] = new int[a.length + b.length];
		int i =0;
		int j = 0;
		int k =0;
		while(i < a.length && j<b.length) {
			if(a[i]<b[j]) {
				merg[k] = a[i];
				k++;
				i++;
			}else {
				merg[k] = b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			merg[k] = a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			merg[k] = b[j];
			j++;
			k++;
		}
		return merg;
	}

	public static void main(String[] args) {
		int arr[]= {1,7,5,12,3,45,32,15,0,77,4,2,90,132,24,67,88};
		sortArray(arr);
		int result[] = mergSort(arr,arr.length);
		for(int i : result) {
			System.out.print(i+" ");
		}
	}

}
