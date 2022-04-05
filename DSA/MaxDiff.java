import java.util.Scanner;
public class MaxDiff {
    static int maxDiff(int[] arr){
        int result = arr[1] - arr[0];
        int minVal = arr[0];
        for(int i=1;i<arr.length;i++){
            result = Math.max(result, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return result;
    }
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println("Array List : ");
        printArr(arr);
        System.out.println("\nMaxDiff : "+maxDiff(arr));
        sc.close();
    }
}
