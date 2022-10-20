package search;

public class SequenceSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3};
		SequenceSearch search = new SequenceSearch();
		System.out.println(search.search(arr, 4));
	}
	
	public int search(int[] arr, int findVal) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findVal) {
				return i;
			}
		}
		return -1;
	}

}
