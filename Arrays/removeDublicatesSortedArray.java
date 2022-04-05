import java.util.Arrays;

class removeDublicatesSortedArray {
    public static void main(String[] args) {
        // int[] arr1 = {12,6,8,9,77,4,45,1};
        int[] arr = {10,20,20,30,30,40,30,10,10};
        Arrays.sort(arr);
        int size = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                size++;
            }
            arr[i] = arr[i+1];
        }
        if(arr.length == 0){
            size = 0;
        }
        System.out.println(size);
    }
}