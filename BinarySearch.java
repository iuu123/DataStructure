package search;

public class BinarySearch {
	private int mid;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 17, 28, 69, 752, 958};
		BinarySearch search = new BinarySearch();
		System.out.println(search.search(arr, 752));
	}
	
	public int search(int[] arr, int findVal) {
		return search1(arr, 0, arr.length - 1, findVal);
	}
	
	public int search1(int[] arr, int low, int high, int findVal) {
		if (low > high) {
			return -1;
		}
		mid = (low + high) / 2;
		if (findVal > arr[mid]) {
			return search1(arr, mid + 1, high, findVal);
		} else if (findVal < arr[mid]) {
			return search1(arr, low, mid - 1, findVal);
		} else {
			return mid;
		}
	}

}
