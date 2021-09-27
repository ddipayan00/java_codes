import java.util.Scanner;
public class intro_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        
        System.out.format("%.4f"+" is the answer ",x);
        sc.close();
    }
}