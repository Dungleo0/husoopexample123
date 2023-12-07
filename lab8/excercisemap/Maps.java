package lab8.excercisemap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"Black");
        map.put(1,"White");
        map.put(2,"Green");

        return map.get(value);
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,10);
        map.put(1,20);
        map.put(2,30);

        System.out.println(count(map));
        empty(map);
        System.out.println(contains(map,10));
        System.out.println(containsKeyValue(map,2,20));

        map.put(0,10);
        map.put(1,20);
        map.put(2,30);
        System.out.println(keySet(map));
        System.out.println(values(map));
        System.out.println(getColor(1));

    }
}
