package Pattern;
import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter columns: ");
	        int cols = sc.nextInt();

	        int[][] arr = new int[rows][cols];

	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        
	        int top = 0, bottom = rows - 1;
	        int left = 0, right = cols - 1;

	        System.out.println("Spiral Traversal:");
	        while (top <= bottom && left <= right) {
	        	
	            for (int i = left; i <= right; i++) {
	                System.out.print(arr[top][i] + " ");
	            }
	            top++;

	            for (int i = top; i <= bottom; i++) {
	                System.out.print(arr[i][right] + " ");
	            }
	            right--;
	            
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    System.out.print(arr[bottom][i] + " ");
	                }
	                bottom--;
	            }

	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(arr[i][left] + " ");
	                }
	                left++;
	            }
	        }

	}

}
