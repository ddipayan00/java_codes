public class LeftRotateByK {
    public static void reverseTheArray(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,12,45,1,7,10};
        int n = arr.length;
        int k = 2;
        reverseTheArray(arr,0,k-1);
        reverseTheArray(arr,k,n-1);
        reverseTheArray(arr,0,n-1);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}