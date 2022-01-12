package RomanNumerals;

public class Test {
    public static void main(String[] args) {
        System.out.println(new RomanNumerals().toRoman(1994));
        System.out.println(new RomanNumerals().toRoman(2022));
        System.out.println(new RomanNumerals().toRoman(1380));
        System.out.println(new RomanNumerals().toRoman(1939));
        System.out.println(new RomanNumerals().fromRoman("II"));
        System.out.println(new RomanNumerals().fromRoman("MMCDXVI"));
    }
}
