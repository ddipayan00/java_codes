public class maximumConsequtive {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,0,1};
        int count = 0;
        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count = 0;
            }
            else{
                count++;
                result = Math.max(count,result);
            }
        }
        System.out.println(result);
    }
}
