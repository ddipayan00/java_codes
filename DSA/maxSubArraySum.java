public class maxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-3,8,-2,4,-5,6};
        int result = arr[0];
        int maxEnd = arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            result = Math.max(result,maxEnd);
        }
        System.out.print(result);
    }
}
