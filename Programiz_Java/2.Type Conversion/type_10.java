import java.util.Scanner;
public class type_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int x1 = sc.nextInt();
        double y = Double.valueOf(x);
        double y1 = x1;
        System.out.format("%.2f\n",y);
        System.out.println(y1);
        sc.close();
    }
}