import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,2,6,4,5,7,-45,0,5,9,2};
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		boolean p = false;
		System.out.print("Search Item : ");
		int k = sc.nextInt();
		System.out.println("\nUnsorted Array : ");
		for(int x: arr){
		    System.out.print(x+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nSorted Array : ");
		for(int x: arr){
		    System.out.print(x+" ");
		}
		while(low < high){
		    mid = (low+high)/2;
		    if(arr[mid] == k){
		        p = true;
		        break;
		    }
		    else if(arr[mid] > k){
		        high = mid-1;
		    }
		    else{
		        low = mid+1;
		    }
		}
		if(p){
		    System.out.println("\nItem found ");
		}
		else{
		    System.out.println("\nItem not found ");
		}
	}
}
