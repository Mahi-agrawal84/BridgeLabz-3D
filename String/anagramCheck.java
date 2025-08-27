package String;
import java.util.Arrays;

public class anagramCheck {

	public static void main(String[] args) {
		String str="listen";
		String str2 = "silent";
		boolean res = true;
		char []arr = str.toCharArray();
		Arrays.sort(arr);
		char []arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		if(str.length()==str2.length()) {
			if(Arrays.equals(arr, arr2)) {
				res=true;
			}
			else {
				res=false;
			}
		}
		else {
			res=false;
		}
		System.out.print(res);
	}

}
