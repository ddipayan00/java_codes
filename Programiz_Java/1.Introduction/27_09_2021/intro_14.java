import java.util.Scanner;
public class intro_14 {
    static String isNullEmpty(String gt){
        if (gt == null) {
            return "NULL";
          }
          else if(gt.isEmpty()){
            return "EMPTY";
          }
          else {
            return "neither NULL nor EMPTY";
          }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String op = sc.nextLine();
        String op1 = "";
        String op2 = null;
        System.out.println("First String  : op = "+op);
        System.out.println("Second String : op1 = \"\" ");
        System.out.println("Third String  : op2 = null \n");
        System.out.println("First String is "+ isNullEmpty(op));
        System.out.println("Second String is "+ isNullEmpty(op1));
        System.out.println("Third String is "+ isNullEmpty(op2)+"\n");
        sc.close();
    }
}