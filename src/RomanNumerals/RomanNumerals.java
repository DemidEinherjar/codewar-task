package RomanNumerals;

public class RomanNumerals {

    private static final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARABIC_NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String toRoman(int n) {

        int value = n;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ARABIC_NUMBERS.length; i++) {
            while (value >= ARABIC_NUMBERS[i]) {
                value -= ARABIC_NUMBERS[i];
                result.append(ROMAN_NUMBERS[i]);
            }
        }

        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {

        String value = romanNumeral;
        int result = 0;

        for (int i = 0; i < ROMAN_NUMBERS.length; i++) {
            while (value.startsWith(ROMAN_NUMBERS[i])) {
                value = value.substring(ROMAN_NUMBERS[i].length(), value.length());
                result += ARABIC_NUMBERS[i];
            }
        }

        return result;
    }
}
