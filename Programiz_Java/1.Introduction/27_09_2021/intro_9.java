import java.util.Scanner;
public class intro_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int ans = (x>y && x>z)?x:(y>z)?y:z;
        System.out.println(ans);
        sc.close();
    }
}
