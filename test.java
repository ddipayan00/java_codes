// import java.util.*;
// import java.lang.*;
// import java.io.*;
public class test{
    public static void main(String[] args) {
        String s1 = "hapy"; 
        String s2 = "ayhp";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Boolean[] gt = new Boolean[c1.length];
        for(int i=0;i<gt.length;i++){
            gt[i] = false;
        }
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(c1[i] == c2[j]){
                    gt[i] = true;
                    break;
                }
            }
        }
        for(int i=0;i<gt.length;i++){
            if(!gt[i]){
                System.out.println("Not Possible ");
                System.exit(0);
            }
        }
        System.out.println("Possible");
    }
}
