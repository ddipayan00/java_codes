import java.util.Arrays;
import java.util.Scanner;
public class mergeTwoArray {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] arr1 = {1,4,9,7};
		int[] arr2 = {3,2,11};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0,j = 0,n = arr1.length,m = arr2.length;
		int[] arr = new int[n+m];
		int k = 0;
		while(i<n&& j<m){
		     if(arr1[i] < arr2[j]){
		        arr[k++] = arr1[i++];
		     }
		     else{
		         arr[k++] = arr2[j++];
		     }
		}
		while(i<n){
		    arr[k++] = arr1[i++];
		}
		while(j<m){
		    arr[k++] = arr2[j++];
		}
		System.out.println("Merged Array : ");
		for(int x : arr){
		    System.out.print(x+" ");
		}
		
	}
}
