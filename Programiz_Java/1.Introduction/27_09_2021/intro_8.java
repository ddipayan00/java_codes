import java.util.Scanner;
public class intro_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if((x >= 65 && x <= 90) || (x >= 97 && x <= 122)){
            if(x== 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                System.out.println(x+" is vowel");
            }
            else if(x== 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
                System.out.println(x+" is vowel");
            }
            else{
                System.out.println(x+" is consonant");
            }
        }
        else
            System.out.println("Wrong Input");
        sc.close();
    }
}