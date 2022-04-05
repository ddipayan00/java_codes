import java.util.Scanner;
public class leftRotateByK {
    static void leftRotateByOneFun(int[] arr, int k){
        int n = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int[] arr,int low, int high){
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
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 5;
        System.out.println("Before moving : ");
        printArr(arr);
        System.out.println("\nAfter moving : ");
        leftRotateByOneFun(arr,k);
        printArr(arr);
        sc.close();
    }
}

