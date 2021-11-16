import java.util.Arrays;
public class removeDublicate {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {2,8,4,2,7,1,66,2,1,9,3,1,99,66,9,0,100,45,7}; // Array Elements
		int n = arr.length;
		System.out.println("Unsorted Array : "); // Unsorted Array 
		for(int x: arr){
		    System.out.print(x+" ");
		}
		System.out.println("\n\nSorted Array : "); // Sorted Array
		Arrays.sort(arr);
		for(int x: arr){
		    System.out.print(x+" ");
		}
		System.out.println("\n\nDistinct Elements :(After removing dublicates) "); // Distinct Elements after removing dublicates
		int count = 1;
		for(int i=0;i<n-1;i++){
		    if(arr[i] != arr[i+1]){
		        System.out.println(arr[i] +" => Count : "+ count + " ");
		        count = 0;
		    }
		    count++;
		}
		count = 1;
		if(arr[n-1] == arr[n-2]){
		    count++;
		    System.out.println(arr[n-1] +" => Count : "+ count + " ");
		}
		else{
		    System.out.println(arr[n-1] +" => Count : "+ count + " ");
		}
	}
}
