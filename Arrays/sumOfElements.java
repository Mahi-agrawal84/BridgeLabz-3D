package Arrays;

public class sumOfElements {
	public static void main(String[] args) {
		int[] arr = {2,5,7,23,97,3,6,78,23,90};
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.print(sum);
	}

}

