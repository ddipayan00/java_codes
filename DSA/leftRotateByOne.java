import java.util.Scanner;
public class leftRotateByOne {
    static void leftRotateByOneFun(int[] arr){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,7,0,4,8,0,12,0};
        System.out.println("Before moving : ");
        printArr(arr);
        System.out.println("\nAfter moving : ");
        leftRotateByOneFun(arr);
        printArr(arr);
        sc.close();
    }
}
