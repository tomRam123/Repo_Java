package Class11_Homework7;

import java.util.Locale;

public class Questions_HW7 {
    Codes_HW7 ans = new Codes_HW7();


    public static void main(String[] args) {

        Codes_HW7 ans = new Codes_HW7();

        System.out.println("\n--> Q1 <--");

        String sentence1 = "make america great again";
        String sentence2 = "outfit of the day";
        String sentence3 = "happy birthday";
        String sentence4 = "Good morning";
        String sentence5 = "Happy new year";
        String sentence6 = "Happy birthday to you dear";
        String sentence7 = "happy new year to you dear";


        System.out.println(ans.abv(sentence1));
        System.out.println(ans.abv(sentence2));
        System.out.println(ans.abv(sentence3));
        System.out.println(ans.abv(sentence4));
        System.out.println(ans.abv(sentence5));
        System.out.println(ans.abv(sentence6));
        System.out.println(ans.abv(sentence7));

        System.out.println("\n--> Q2 <--");

        String sent1 = "HappY nEW YEAR to YoU dEAr";
        String sent2 = "gooD morNING";
        String sent3 = "make AMERICA GreAT AgAIn";

        System.out.println(ans.titleCase(sent1));
        System.out.println(ans.titleCase(sent2));
        System.out.println(ans.titleCase(sent3));

        System.out.println("\n--> Q3 <--");

        String sentA = "Learn";
        String sentB = "Learn More";
        String sentC = "happy birthday to you";

        System.out.println(ans.reverseSEnt(sentA));
        System.out.println(ans.reverseSEnt(sentB));
        System.out.println(ans.reverseSEnt(sentC));

        System.out.println("\n--> Q4 <--");

        int[] numbers1 = {23, 54, 76, 12, 67, 90, 23};
        int[] numbers2 = {23, 54, 76, 12};
        int[] numbers3 = {-2, -9, -4, -7, -9, -55};

        System.out.println(ans.maxNum(numbers1));
        System.out.println(ans.maxNum(numbers2));
        System.out.println(ans.maxNum(numbers3));

        System.out.println("\n--> Q5 <--");

        String word1 = "levl";
        String word2 = "Eye";
        String word3 = "lol";

        System.out.println(ans.isStringPalindrome(word1));
        System.out.println(ans.isStringPalindrome(word2));
        System.out.println(ans.isStringPalindrome(word3));



    }










}
