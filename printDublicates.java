import java.util.*;
public class printDublicates {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String lol = sc.nextLine();
        HashMap<Character,Integer> set = new HashMap<Character,Integer>();
        for(int i=0;i<lol.length();i++){
            char x = lol.charAt(i);
            if(set.containsKey(x)){
                int y = set.get(x);
                set.put(x,y+1);
            }
            else{
                set.put(x,1);
            }
        }
        for(Map.Entry<Character,Integer> a : set.entrySet()){
            int z = a.getValue();
            if(z>1){
                while(z>0){
                    System.out.print(a.getKey());
                    z--;
                }
            }
        }
        
	}
}
