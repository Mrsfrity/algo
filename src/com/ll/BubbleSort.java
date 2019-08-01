package com.ll;

public class BubbleSort {

	public static void bubblesort(int arr[]) {
		//外层循环,循环5次
		for(int i = 0; i < arr.length-1; i++) {
			//相邻对比，外层循环一次，则对比次数减一
			for(int j = 0; j < arr.length-i-1; j++) {
				//相邻对比，升序排列
				if(arr[j] > arr[j+1]) {
					int c = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = c;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,3,6,1,7,5};
		System.out.println("原数组：");
		for(int a = 0;a < arr.length; a++) {
			System.out.print(arr[a]);
		}
		System.out.println();
		bubblesort(arr);
		System.out.println("排序后为：");
		for(int b = 0; b < arr.length; b++) {
			System.out.print(arr[b]);
		}
	}

}
