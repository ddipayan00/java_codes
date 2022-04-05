import java.util.Scanner;
public class type_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        Long x1 = sc.nextLong();
        int y = (int)x;
        int y1,y2;
        Integer y3;
        try {
            y1 = Math.toIntExact(x);
            y2 = x1.intValue();
            y3 = x1.intValue();
            System.out.println(y+" y");
            System.out.println(y1+" y1");
            System.out.println(y2+" y2");
            System.out.println(y3+" y3");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        sc.close();
    }
}