package Class11_Homework7;

import java.util.Locale;

public class Codes_HW7 {


    public String abv(String words) {

        words = words.toUpperCase(Locale.ROOT);
        String[] wordsArray = words.split(" ");
        String abv = "";

        for (int i = 0; i <= wordsArray.length - 1; i++)
            abv = abv + wordsArray[i].charAt(0);

        return abv;
    }

    public String titleCase(String sentence) {
        String sen1ToUp = sentence.toUpperCase(Locale.ROOT);
        String[] sen1ToUpSplit = sen1ToUp.split(" ");
        String titleCase = "";

        for (int i = 0; i < sen1ToUpSplit.length; i++) {
            titleCase = titleCase + sen1ToUpSplit[i].substring(0, 1).toUpperCase(Locale.ROOT) + sen1ToUpSplit[i].substring(1).toLowerCase(Locale.ROOT) + " ";
        }
        return titleCase;
    }

    public String reverseSEnt(String sentence) {

        String[] sent2Split = sentence.split(" ");
        String sent2Reverse = "";


        for (int i = 1; i <= sent2Split.length; i++) {
            sent2Reverse += sent2Split[sent2Split.length - i] + " ";
        }

        return sent2Reverse;
    }

    public int maxNum(int[] numbers) {

        int maxNum = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > maxNum)
                maxNum = numbers[i];
        }


        return maxNum;

    }

   // public static void main(String[] args) {


        public  boolean isStringPalindrome(String word) {
        // word = word.toLowerCase();
        // String reverseWord = "";
        // for (String alphabet : word.split("")) {
        //     reverseWord += alphabet;
        // }
        // return word.equalsIgnoreCase(reverseWord);
        //String word = "eye" ;

        String[] wordsplit = word.split("");
        String wordReversed = "";
        boolean palindrone = false;

        for (int i = 1; i <= wordsplit.length ; i++) {
            wordReversed += wordsplit[wordsplit.length - i] + "";

            if (wordReversed.equalsIgnoreCase(word))
                palindrone = true;


        }
return palindrone;
    }
}