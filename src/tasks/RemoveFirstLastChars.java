package tasks;

public class RemoveFirstLastChars {
    public static String remove(String str) {
        return str.substring(1, str.length() -1);
    }
}
