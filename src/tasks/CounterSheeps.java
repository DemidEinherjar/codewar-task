package tasks;

/*
Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).
*/

public class CounterSheeps {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++) {
            if(arrayOfSheeps[i] != null && arrayOfSheeps[i]){
                count++;
            }
        }
        return count;
    }
}
