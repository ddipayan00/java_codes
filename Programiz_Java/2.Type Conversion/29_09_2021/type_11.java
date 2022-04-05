import java.util.Scanner;
public class type_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double x1 = sc.nextDouble();
        int y = (int)x;
        int y1 = (int)Math.round(x1);
        System.out.println(y);
        System.out.println(y1);
        sc.close();
    }
}