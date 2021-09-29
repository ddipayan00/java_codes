import java.util.Scanner;
public class type_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        double b = 10.01;
        boolean c = false;
        float d = 10.0f;
// +++++++++++++++++++// +++++++++++++++++++
        Integer x = Integer.valueOf(a);
        Double y = Double.valueOf(b);
        Boolean z = Boolean.valueOf(c);
        Float u = Float.valueOf(d);
// +++++++++++++++++++ // +++++++++++++++++++
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(u);
// +++++++++++++++++++ // +++++++++++++++++++
        Integer a1 = 10;
        Double b1 = 10.01;
        Boolean c1 = false;
        Float d1 = 10.0f;
// +++++++++++++++++++ // +++++++++++++++++++
        int x1 = a1.intValue();
        double y1 = b1.doubleValue();
        boolean z1 = c1.booleanValue();
        float u1 = d1.floatValue();
// +++++++++++++++++++ // +++++++++++++++++++
        System.out.println("\n\n"+x1);
        System.out.println(y1);
        System.out.println(z1);
        System.out.println(u1);
        sc.close();
    }
}