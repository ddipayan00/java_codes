public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,715,4,8,48,3,7};
        int temp = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp; 
        for(int x : arr){
            System.out.print(x+" ");
        }    
    }
}
