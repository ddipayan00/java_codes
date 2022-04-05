import java.util.Scanner;
public class arrayReverse{
    static void reverse(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,5,8,9,1};
        System.out.println("Before Reverse : ");
        printArr(arr);
        System.out.println("\nAfter Reverse : ");
        reverse(arr);
        printArr(arr);
        sc.close();
    }
}