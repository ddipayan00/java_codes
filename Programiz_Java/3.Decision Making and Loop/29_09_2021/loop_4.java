import java.util.Scanner;
public class loop_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = (x*(x+1))/2;
        System.out.println("Sum of natural number ["+ x +"] : "+ n);
        sc.close();
    }
}