package com.exatip.product.service;
//

//public class Test {
//
//	public static void main(String[] args) {
//
//		
//		int[] numbers = {4, 3, 6, 7, 1, 2, 8, 6};
//		
//		for(int i = 0; i<numbers.length; i+=3) {
//			reverseInPairs(numbers, i, );
//		}
//			
//	}
//	
//	private static void reverseInPairs(int arr[], int start, int end) {
//		
//		while(start<end) {
//			int temp=arr[start];
//			
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end++;
//		}
//	}
//
//}

public class Test {
	public static void main(String[] args) {
		int[] array = { 4, 3, 6, 7, 1, 2, 8, 6 };
		reversePairsOfThree(array);
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void reversePairsOfThree(int[] array) {
		for (int i = 0; i < array.length; i += 6) {
			int start = i;
			int end = Math.min(i + 2, array.length - 1);
			while (start < end) {
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}
		}
	}
}
