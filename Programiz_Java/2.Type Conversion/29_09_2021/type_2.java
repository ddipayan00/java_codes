import java.util.Scanner;
public class type_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = sc.next().charAt(0);
        int a = ch;
        Object gt = ch;
        Object gf = a;
        System.out.println("Character : "+ch);
        System.out.println("Variable Type : "+gt.getClass().getSimpleName());
        System.out.println("\n1.Integer : "+a);
        System.out.println("Variable Type : "+gf.getClass().getSimpleName());
        sc.close();
    }
}