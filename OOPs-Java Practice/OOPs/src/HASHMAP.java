import  java.util.*;
public class HASHMAP {
    public static void main(String args[]){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Varun",1);
        map.put("Varun",2);
        map.put("punit",3);
        map.put("Superstar",4);
        map.put("Varun dh",5);
        map.put("jyoti",6);
        map.put("Arun",1);
        map.put("RAj",2);
        map.put("Arun",2);
        System.out.println();
        System.out.println(map);
        System.out.println();
        System.out.println("Using for each loop : ");
        for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
            String key = mapElement.getKey();
            int value = (mapElement.getValue());
            System.out.println(key + " : " + value);
        }
        System.out.println();
        System.out.println("Using for each method : ");
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
