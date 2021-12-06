package tasks;

/*
Given a list lst and a number N,
create a new list that contains each number of lst at most N times without reordering.
For example if N = 2, and the input is [1,2,3,1,2,1,2,3],
you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times,
and then take 3, which leads to [1,2,3,1,2,3].
 */

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
