import java.util.Scanner;
public class moveZero {
    
    static void MoveZero(int[] arr){
        int pointer = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
        }
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
        MoveZero(arr);
        printArr(arr);
        sc.close();
    }
}
