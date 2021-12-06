package dataStructures;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-123,-121,-17,-2,2,4,6,86,89,91,934,978};
		int target = 978;
		System.out.println(bSearch(arr, target));
	}
	
	
	static int bSearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		// (start+end)/2 similar 
		
		while(start<=end) {
			
			int mid = start +(end-start) / 2 ;
			if(target<arr[mid]) {
				end = mid-1;
			}else if(target>arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}return -1;
	}

}
