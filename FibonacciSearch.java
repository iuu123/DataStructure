package search;

import java.util.Arrays;

public class FibonacciSearch {
	private int[] fibonacci = new int[30]; // 可以自己设置斐波那契数列的长度
	private int high;
	private int i;
	private int mid;
	private int[] temp;
	
	public FibonacciSearch() {
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for (int i = 2; i < 30; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
	}
	
	public int search(int[] arr, int findVal) {
		high = arr.length - 1;
		for (i = 0; i < fibonacci.length; i++) {
			if (fibonacci[i] - 1 >= high) {
				break;
			}
		}
		temp = Arrays.copyOf(arr, fibonacci[i] - 1);
		for (int j = high + 1; j < fibonacci[i] - 1; j++) {
			temp[j] = arr[high];
		}
		return search1(temp, 0, arr.length - 1, findVal, i);
	}
	
	public int search1(int[] temp, int low, int high, int findVal, int n) {
		if (low > high) {
			return -1;
		}
		mid = low + fibonacci[n - 1] - 1;
		if (findVal > temp[mid]) {
			return search1(temp, mid + 1, high, findVal, n-2);
		} else if (findVal < temp[mid]) {
			return search1(temp, low, mid - 1, findVal, n - 1);
		} else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 6, 9, 12, 15, 18};
		FibonacciSearch search = new FibonacciSearch();
		System.out.println(search.search(arr, 12));
	}

}
