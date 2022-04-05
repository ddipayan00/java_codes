import java.util.Scanner;
public class type_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        int x = sc.nextInt();
        char y = (char)x;
        char a = (char)(x+'0');
        Object gt = x;
        Object gf = y;
        System.out.println("\n1.Integer : "+x);
        System.out.println("Variable Type : "+gt.getClass().getSimpleName());
        System.out.println("\nCharacter : "+a);
        System.out.println("Variable Type : "+gf.getClass().getSimpleName());
        sc.close();
    }
}