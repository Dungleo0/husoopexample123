package lab8.excerciseset;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersect = new HashSet<>();
        for (Integer x : first) {
            if (second.contains(x)) {
                intersect.add(x);
            }
        }
        return intersect;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>();
        for (Integer x : source) {
            if (!list.contains(x)) {
                list.add(x);
            }
        }
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>();
        for (Integer x : source) {
            set.add(x);
        }
        List<Integer> result = new ArrayList<>(set);
        return result;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : source) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }
        return newList;
    }

    public static String firstRecurringCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char c = '#';
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            if (!map.containsKey(p)) {
                map.put(p, i);
            } else {
                if (map.get(p) < index) {
                    index = map.get(p);
                    c = p;
                }
            }
        }
        return Character.toString(c);
    }

    public static Set<Character> allRecurringChars(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Set<Character> re = new HashSet<Character>();
        char c = '#';
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            if (!map.containsKey(p)) {
                map.put(p, i);
            } else {
                index = map.get(p);
                c = p;
                re.add(c);
            }
        }
        return re;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] result = new Integer[source.size()];
        List<Integer> list = new ArrayList<>(source);
        for (int i = 0; i < source.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);


        System.out.println(intersectionManual(set1,set2));
        System.out.println(unionManual(set1,set2));
        System.out.println(intersection(set1,set2));
        System.out.println(union(set1,set2));
        System.out.println(toList(set1));
        removeDuplicates(set1.stream().toList());
        removeDuplicatesManual(set2.stream().toList());
        firstRecurringCharacter("abc");
        allRecurringChars("abc");
        toArray(set1);
        System.out.println(getFirst(new TreeSet<>(set1)));
        System.out.println(getLast(new TreeSet<>(set2)));
        System.out.println(getGreater(new TreeSet<>(set1),1));

    }
}
