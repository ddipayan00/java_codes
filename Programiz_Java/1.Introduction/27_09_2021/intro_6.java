import java.util.Scanner;
public class intro_6 {
    public static int[] swap1(int[] arr){
        arr[0] = arr[0]+arr[1];
        arr[1] = arr[0]-arr[1];
        arr[0] = arr[0]-arr[1];
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        System.out.println("Before Swap : x: "+ x +" y: "+y);
        swap1(arr);
        System.out.println("After Swap : x: "+ arr[0] +" y: "+arr[1]);
        sc.close();
    }
}