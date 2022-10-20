package search;

public class InsertValueSearch {
	int mid;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 6, 9, 12, 15, 18};
		InsertValueSearch search = new InsertValueSearch();
		System.out.println(search.search(arr, 15));
	}
	
	public int search(int[] arr, int findVal) {
		if (findVal < arr[0] || findVal > arr[arr.length - 1]) {
			return -1;
		}
		return search1(arr, 0, arr.length - 1, findVal);
	}
	
	public int search1(int[] arr, int low, int high, int findVal) {
		if (low > high) {
			return -1;
		}
		mid = low + (high - low) * (findVal - arr[low]) / (arr[high] - arr[low]);
		if (findVal > arr[mid]) {
			return search1(arr, mid + 1, high, findVal);
		} else if (findVal < arr[mid]) {
			return search1(arr, low, mid - 1, findVal);
		} else {
			return mid;
		}
	}

}
