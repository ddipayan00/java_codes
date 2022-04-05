import java.util.Scanner;
public class loop_3 {
    static void gt(char x){
        System.out.println("Function Invoked !!!!");
        if(Character.isAlphabetic(x)){
            System.out.println(x+" is an alphabet");
        }
        else{
            System.out.println(x+" is not an alphabet");
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        
        if(x >= 65 && x <= 90){
            gt(x);
        }
        else{
            if((x >= 65 && x <= 90) || (x >= 97 && x <= 122)){
                System.out.println(x+" is an alphabet");
            }
            else{
                System.out.println(x+" is not an alphabet");
            }
        }
        sc.close();
    }
}