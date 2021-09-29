import java.util.Scanner;
public class type_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String x1 = sc.nextLine();
        double y = Double.valueOf(x);
        double y1 = Double.parseDouble(x1);
        System.out.println(y);
        System.out.println(y1);
        sc.close();
    }
}