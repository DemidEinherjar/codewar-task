package ReversedSequence;

public class Sequence{
    public static int[] reverse(int n){
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = n - i;
        }
        return result;
    }
}
