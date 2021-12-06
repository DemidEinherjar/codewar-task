package tasks;
/*
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
*/

public class FakeBinary {
    public static String fakeBin(String numberString) {
       numberString = numberString.replaceAll("[1-4]", "0");
       return numberString.replaceAll("[5-9]", "1");
    }
}