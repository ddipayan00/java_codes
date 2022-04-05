public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,715,4,8,48,3,7,41,1,9,714};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(firstMax < arr[i]){
                firstMax = arr[i];
            }
            else if(secondMax < arr[i] && secondMax <= firstMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
