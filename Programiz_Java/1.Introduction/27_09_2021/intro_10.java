import java.util.Scanner;
public class intro_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double a = sc.nextDouble();
        double c = sc.nextDouble();
        double d = (b*b) - (4*a*c);
        double r1,r2;
        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", r1, r2);
          }
          else if (d == 0) {
            r1 = r2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", r1);
          }
          else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
          }
        sc.close();
    }
}