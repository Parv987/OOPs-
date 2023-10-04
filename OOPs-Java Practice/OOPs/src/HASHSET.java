import java.util.*;
public class HASHSET {
    public static void main(String args[]){
        HashSet<Integer>set=new HashSet<>();
        set.add(10);
        set.add(17);
        set.add(15);
        set.add(123);
        set.add(17);
        set.add(56);
        set.add(60);
//Traversing using iterator
       Iterator<Integer>it=set.iterator();
          while(it.hasNext()){
              System.out.println(it.next());
          }
        System.out.println("");
//Traversing using for each method
        set.forEach(i -> System.out.println(i));
        System.out.println();
//Traversing using for each loop
        for(int i : set){
            System.out.println(i);
        }
    }
}
