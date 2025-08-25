package Arrays;

public class mergeArrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9};
		int[] arr3 = new int[arr.length + arr2.length];
		int len=0;
		while(len<arr3.length) {
			for(int i=0;i<arr.length;i++) {
				arr3[len] = arr[i];
				len++;
			}
			for(int i=0;i<arr2.length;i++) {
				arr3[len] = arr2[i];
				len++;
			}
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
