package dataStructures;

public class OrderAgonostiSearch {

	public static void main(String[] args) {
		//int[] arr = {-123,-121,-17,-2,2,4,6,86,89,91,934,978};
		int[] arr = {99,87,65,45,34,23,8,5,3,2,-23,-232};
		int target = 87;
		int ans = oABS(arr, target);
		System.out.println(ans);
	}
	//binery search for sorted array ethir asse or desc
	static int oABS(int[]arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsse= arr[start]<arr[end];
		
		//boolean isAsse;
//		if(arr[start]<arr[end]) {
//			isAsse = true;
//		}
		while(start<=end) {
			
			int mid = start +(end-start)/2;
			
			if(arr[mid]== target) {
				return mid;
			}
		
		if(isAsse) {
			if(target<arr[mid]) {
				end = mid-1;
			}else if(target>arr[mid]){
				start=mid+1;
			}
	   }else {
		   if(target>arr[mid]) {
				end = mid-1;
			}else if(target<arr[mid]){
				start=mid+1;
			}
			
		}
		
	}
		return-1;
	}

}
