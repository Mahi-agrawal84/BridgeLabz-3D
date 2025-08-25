package Arrays;

public class countElement {

	public static void main(String[] args) {
		int[] arr = {2,3,4,2,7,5,6,4,4};
		int n=arr.length;
		int count=0;
		int ele = 4;
		for(int i=0;i<n;i++) {
			if(arr[i] == ele) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
