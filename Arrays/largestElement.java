class largestElement{
    public static void main(String[] args) {
        int[] arr = {1,2,715,4,8,48,3,7,41,1,9,714};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}