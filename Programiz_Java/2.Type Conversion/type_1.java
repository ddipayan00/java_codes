import java.util.Scanner;
public class type_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = sc.next().charAt(0);
        String str = Character.toString(ch);
        Object gt = ch;
        Object gf = str;
        System.out.println("Character : "+ch);
        System.out.println("Variable Type : "+gt.getClass().getSimpleName());
        System.out.println("String : "+str);
        System.out.println("Variable Type : "+gf.getClass().getSimpleName()+"\n");
        System.out.println("Enter the String : ");
        String t = sc.next();
        char[] ok = t.toCharArray();
        Object x = t;
        Object y = ok;
        System.out.println("String : "+t);
        System.out.println("Variable Type : "+x.getClass().getSimpleName()+"\n");
        if(ok.length <= 1){
            char he = ok[0];
            y = he;
            System.out.println("Character : "+he);
            System.out.println("Variable Type : "+y.getClass().getSimpleName());
        }
        else{
            System.out.println("Character : "+ok[0]);
            System.out.println("Variable Type : "+y.getClass().getSimpleName()+"\n\n");
        }   
        sc.close();
    }
}