import java.util.Scanner;
public class intro_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x/y);
        System.out.println(x%y);
        sc.close();
    }
}