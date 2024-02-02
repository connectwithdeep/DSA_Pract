public class Solution {
	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		if(startIndex >= endIndex) return;
		int pIndex = partition(input, startIndex, endIndex);
		quickSort(input, startIndex, pIndex-1);
		quickSort(input, pIndex+1, endIndex);
	
	}
	public static int partition(int[] arr, int low, int high){
		int piviot = arr[low];
		int i = low;
		int j = high;
		while(i < j){
			while(arr[i] <= piviot && i <= high - 1){
				i++;
			}
			while(arr[j] > piviot && j >= low + 1){
				j--;
			}
			if(i < j){
				swap(arr, i , j);
			}
		}

		swap(arr, low, j);
		return j;
	}

	public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
