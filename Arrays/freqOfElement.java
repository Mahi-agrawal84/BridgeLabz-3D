package Arrays;

public class freqOfElement {
	public static void main(String args[]) {
		int arr[] = {2,3,4,5,5,6,5,1};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max = Math.max(max, i);
		}
		int count[] = new int[max+1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
			System.out.println("frequency of "+i+ "  : "+ count[i]+ " ");
			}
		}
		
	}
}