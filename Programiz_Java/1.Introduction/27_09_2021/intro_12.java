import java.util.Scanner;
public class intro_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Original String");
        String x = sc.nextLine();
        System.out.println("New String");
        x = x.replaceAll("\\s", "");
        System.out.println(x);
        sc.close();
    }
}