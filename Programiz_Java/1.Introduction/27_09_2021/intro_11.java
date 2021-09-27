import java.util.Scanner;
public class intro_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char y = sc.next().charAt(0);
        int i = 0;
        int count = 0;
        while(i < x.length()){
            if(x.charAt(i) == y){
                count++;
            }  
            i++;
        }
        System.out.println(count);
        sc.close();
    }
}