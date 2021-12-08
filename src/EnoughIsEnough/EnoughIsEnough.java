package EnoughIsEnough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if(maxOccurrences < 1) return new int[0];
        for(Integer i : elements){
            Integer j = hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
            if(j == null || j < maxOccurrences){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
