import java.util.Arrays;
import java.util.Scanner;
public class frequencySortedArray {
    static void printFreq(int[] arr){
        int f = 1;
        int i = 1;
        while(i < arr.length){
            while(i < arr.length && arr[i] == arr[i-1] ){
                f++;
                i++;
            }
            System.out.println("Arr: "+arr[i-1]+ " Freq: "+f);
            i++;
            f = 1;
        }
        if(arr.length == 1 || arr[arr.length-1] != arr[arr.length-2]){
            System.out.println("Arr: "+arr[arr.length-1]+ " Freq: 1");
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
        int[] arr = {2,3,10,6,4,8,1};
        Arrays.sort(arr);
        System.out.println("Array List : ");
        printArr(arr);
        System.out.print("\nFrequency List : \n");
        printFreq(arr);
        sc.close();
    }
}
