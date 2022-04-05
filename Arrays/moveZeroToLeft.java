public class moveZeroToLeft {
    public static void main(String[] args) {
        int[] arr = {10,8,0,20,0,0,12,0};
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != 0){
                // System.out.println(arr[i]+" "+arr[count]);
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
