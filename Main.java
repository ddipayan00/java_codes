import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
        HashSet<Integer> hashset = new HashSet<Integer>();

        hashmap.put("Barasat",1);
        hashmap.put("Gangarampur",2);
        hashmap.put("Kolkata",3);


        System.out.println(hashmap+" "+hashmap.containsKey("Gangarampur"));
        System.out.println(hashmap.containsValue(2)+" "+hashmap.size());

        hashset.add(10);
        hashset.add(20);
        System.out.println(hashset+" "+hashset.contains(10)+" "+hashset.size());


        hashmap.forEach((k,l) -> System.out.println(k+" == "+l));
        hashset.forEach((x) -> System.out.println(x));
        hashmap.get("Kolkata"); // Returns the value for the key if not found then null
        // hashset.clear(); // Removes all elements


        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();


        arraylist.addAll(hashset);
        linkedlist.addAll(hashset);


        arraylist.set(0, 100);
        linkedlist.get(0);

        System.out.println(arraylist.get(0));
        System.out.println(linkedlist.contains(10)+" "+linkedlist.getLast()+" "+linkedlist.getFirst());

        
        List<Integer> ok = new ArrayList<Integer>(hashmap.values());
        List<String> ok1 = new ArrayList<String>(hashmap.keySet());
        ok.size();


        List<Integer> ok2 = new ArrayList<Integer>();
        ok2.addAll(arraylist);
        ok2.addAll(linkedlist);
        ok2.get(0);
        ok2.set(0, 200);

        
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        mp.size();
        mp.put(1, 500);
        mp.get(1);
        mp.containsKey(1);
        mp.containsValue(500);


        Set<Integer> ls = new HashSet<Integer>();
        ls.size();


    }
}