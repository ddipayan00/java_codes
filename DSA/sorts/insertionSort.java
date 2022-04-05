public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,8,0,4,6,7,17,24,10};
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j  >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
