package TakeATenMinuteWalk;
import java.util.HashMap;

public class TenMinWalkSolutionOne {
    public static boolean isValid(char[] walk) {
        if(walk.length == 10) {
            return getAnswer(walk);
        } else {
            return false;
        }
    }

    public static boolean getAnswer(char[] walk) {
        String[] walking = new String(walk).split("(?<=.)");
        HashMap<String, Integer> repeatedMap = new HashMap<String, Integer>();
        for(String side : walking) {
            if(repeatedMap.containsKey(side)){
                repeatedMap.put(side, repeatedMap.get(side) + 1);
            } else {
                repeatedMap.put(side, 1);
            }
        }
        return repeatedMap.get("n") == repeatedMap.get("s") && repeatedMap.get("e") == repeatedMap.get("w");
    }
}