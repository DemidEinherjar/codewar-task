package ExesAndOhs;

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
}