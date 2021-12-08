package StringRepeat;

public class RepeaterStr {
    public static String repeaterStr(final int repeat, final String string){
        return new String(new char[repeat]).replace("\0", string);
    }
}
