package Arrays;

public class arrayAscending{
	 public static void main(String args[]) {
		 int arr[] = {2,5,6,3,7,9};
		 boolean res=true;
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i-1]>arr[i]) {
				 res=false;
				 break;
			 }
		 }
		 if(res==false) {
			 System.out.print("not sorted");
		 }
		 else {
			 System.out.print("sorted");
		 }
	 }
}