public class type_7 {
    public static void main(String[] args) {
        String s1 = "true";
        String s2 = "false";
        String s3 = "true";
        String s4 = "tru";
        boolean b1 = Boolean.parseBoolean(s1);
        boolean b2 = Boolean.valueOf(s2);
        System.out.println(b1); // true
        System.out.println(b2); // false
        // -----------------------------------
        boolean b3 = false;
        boolean b4 = true;
        b3 = Boolean.parseBoolean(s3);
        b4 = Boolean.parseBoolean(s4);
        System.out.println(b3); // true
        System.out.println(b4); // false
    }
}