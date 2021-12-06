package tasks;

/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
*/
public class XO {
    public static boolean getXO (String str) {
        str = str.toLowerCase();
        int countX = 0, countO = 0;
        for(char element : str.toCharArray()){
            if(element == 'x') countX++;
            if(element == 'o') countO++;
        }
        return countX == countO;
    }
/*    public static boolean getXOwithCountMathes(String str){
        str = str.toLowerCase();
        int countX = StringUtils.countMatches(str, "x"), countO = StringUtils.countMatches(str, "o");
        return countX == countO;
    }*/
}