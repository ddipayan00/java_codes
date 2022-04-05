import java.util.Scanner;
public class leaderArray {
    static void leaderList(int[] arr){
        for(int i=0;i<arr.length;i++){
            Boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.print(arr[i]+" ");
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
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] a = {7,10,4,10,6,5,2};
        System.out.println("Array List : ");
        printArr(a);
        System.out.println("\nLeader List : ");
        leaderList(a);
        sc.close();
    }
}


