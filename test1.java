public class test1 {
    static int sec(int[] arr){
        int res = -1;
        int largest = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return arr[res];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sec(arr));
    }
}
