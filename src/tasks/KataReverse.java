package tasks;

import java.util.Arrays;

/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
 */
public class KataReverse {
    public static String reverseWords(final String original){
        String[] arrayList = original.split(" ");
        for(int i = 0 ; i < arrayList.length; i++) {
            arrayList[i].replaceAll(" ", "");
            arrayList[i] = new StringBuilder(arrayList[i]).reverse().toString();
        }
       return Arrays.toString(arrayList)
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");
    }
}
