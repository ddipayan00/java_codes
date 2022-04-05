import java.util.Scanner;
public class removeDublicate {
    static int dublicate(int[] arr){
        int temp = arr[0];
        int size = 1;
        for(int i=1;i<arr.length;i++){
            if(temp != arr[i]){
                temp = arr[i];
                size++;
            }
        }
        return size;
    }
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,2,10,11,88,99,99,200};
        System.out.println("Before removing : ");
        printArr(arr);
        System.out.println("\nAfter removing : ");
        System.out.println("\n"+dublicate(arr));
        printArr(arr);
        sc.close();
    }
}
