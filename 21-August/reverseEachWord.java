package Practice;

public class reverseEachWord {

	public static void main(String[] args) {
        String str="Hii How Are you";
        String word[]=str.split(" ");
        String temp;
      for(int i=0;i<word.length;i++) {
    	  temp=word[i];
    	  for(int j=temp.length()-1;j>=0;j--) {
    		  System.out.print(temp.charAt(j));
    	  }
    	  System.out.print(" ");
		 
      }
	}
}
