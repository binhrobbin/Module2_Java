package Map_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseMap {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,3,4,3,5};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.replace(array[i], map.get(array[i])+1);
            }
            else map.put(array[i],1);
        }
        System.out.println(map.entrySet());
        Set<Integer> key = map.keySet();
        for (Integer item: key){
            System.out.println(item+":"+ map.get(item));
        }
    }
}
