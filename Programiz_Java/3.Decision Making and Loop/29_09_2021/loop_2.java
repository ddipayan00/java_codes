import java.util.Scanner;
public class loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0 && x!= 0){
            System.out.println(x+" is positive");
        }
        else if(x == 0){
            System.out.println("Number is Zero");
        }
        else{
            System.out.println(x+" is negative");
        }
        
        
        sc.close();
    }
}