import java.util.Scanner;
public class loop_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean y = false;
        if(x%4 == 0){
            if(x%100 == 0){
                if(x%400 == 0){
                    y = true;
                }
                else{
                    y = false;
                }
            }
            else{
                y = false;  
            } 
        }
        else{
            y = false;
        }
        if(y)
            System.out.println(x + " is a leap year");
        else
            System.out.println(x + " is not a leap year");
        sc.close();
    }
}