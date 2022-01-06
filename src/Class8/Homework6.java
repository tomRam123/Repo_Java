package Class8;

import java.util.Arrays;
import java.util.Locale;

public class Homework6 {

    public static void main(String[] args) {
        System.out.println("--> Q1 <--");

        /**
         * Q1;
         * create the abbreviation for sentence
         **/

        String sentence1 = "make america great again";
        String sentence2 = "outfit of the day";
        String sentence3 = "happy birthday";
        String sentence4 = "Good morning";
        String sentence5 = "Happy new year";
        String sentence6 = "Happy birthday to you dear";
        String sentence7 = "happy new year to you dear";

        sentence1 = sentence1.toUpperCase(Locale.ROOT);
        String[] sentence1Array = sentence1.split(" ");
        String abv = "";

        for (int i = 0; i <= sentence1Array.length - 1; i++)
            abv = abv + sentence1Array[i].charAt(0);
        {
            System.out.println(abv);
        }


        sentence2 = sentence2.toUpperCase(Locale.ROOT);
        String[] sentence2Array = sentence2.split(" ");
        String abv2 = "";

        for (int i = 0; i <= sentence2Array.length - 1; i++) {
            abv2 = abv2 + sentence2Array[i].charAt(0);
        }
        System.out.println(abv2);

        sentence3 = sentence3.toUpperCase(Locale.ROOT);
        String[] sentence3Array = sentence3.split(" ");
        String abv3 = "";

        for (int i = 0; i <= sentence3Array.length - 1; i++) {
            abv3 = abv3 + sentence3Array[i].charAt(0);
        }
        System.out.println(abv3);

        sentence4 = sentence4.toUpperCase(Locale.ROOT);
        String[] sentence4Array = sentence4.split(" ");
        String abv4 = "";

        for (int i = 0; i <= sentence4Array.length - 1; i++) {
            abv4 = abv4 + sentence4Array[i].charAt(0);
        }
        System.out.println(abv4);

        sentence5 = sentence5.toUpperCase(Locale.ROOT);
        String[] sentence5Array = sentence5.split(" ");
        String abv5 = "";

        for (int i = 0; i <= sentence5Array.length - 1; i++) {
            abv5 = abv5 + sentence5Array[i].charAt(0);
        }
        System.out.println(abv5);

        sentence6 = sentence6.toUpperCase(Locale.ROOT);
        String[] sentence6Array = sentence6.split(" ");
        String abv6 = "";

        for (int i = 0; i <= sentence6Array.length - 1; i++) {
            abv6 = abv6 + sentence6Array[i].charAt(0);
        }
        System.out.println(abv6);

        sentence7 = sentence7.toUpperCase(Locale.ROOT);
        String[] sentence7Array = sentence7.split(" ");
        String abv7 = "";

        for (int i = 0; i <= sentence7Array.length - 1; i++) {
            abv7 = abv7 + sentence7Array[i].charAt(0);
        }
        System.out.println(abv7);

        System.out.println("--> Q2 <--");

        /**
         * Q2;
         * change the given sentence in titlecase
         *
         */

        String sen1 = "HappY nEW YEAR to YoU dEAr";
        String  sen2 = "gooD morNING";
        String sen3 = "make AMERICA GreAT AgAIn";

        String sen1ToUp = sen1.toUpperCase(Locale.ROOT);
        String[] sen1ToUpSplit = sen1ToUp.split(" ");
        String gM = "";

        for (int i = 0; i < sen1ToUpSplit.length; i++) {
            gM = gM + sen1ToUpSplit[i].substring(0, 1).toUpperCase(Locale.ROOT) + sen1ToUpSplit[i].substring(1).toLowerCase(Locale.ROOT) + " ";
        }

        for (int i = 0; i < sen1ToUpSplit.length; i++) {
            gM = gM + sen1ToUpSplit[i].substring(0, 1).toUpperCase(Locale.ROOT) + sen1ToUpSplit[i].substring(1).toLowerCase(Locale.ROOT) + " ";
        }
        System.out.println(gM);


        String sen2ToUp = sen2.toUpperCase(Locale.ROOT);
        String[] sen2ToUpSplit = sen2.split(" ");
        String hNYTOD = "";

        for (int i = 0; i < sen2ToUpSplit.length; i++) {
            hNYTOD = hNYTOD + sen2ToUpSplit[i].substring(0, 1).toUpperCase(Locale.ROOT) + sen2ToUpSplit[i].substring(1).toLowerCase(Locale.ROOT) + " ";
        }
        System.out.println(hNYTOD);

        String sen3ToUp = sen3.toUpperCase(Locale.ROOT);
        String[] sen3ToUpSplit = sen3ToUp.split(" ");
        String mAGA = "";

        for (int i = 0; i < sen3ToUpSplit.length; i++) {
            mAGA = mAGA + sen3ToUpSplit[i].substring(0, 1).toUpperCase(Locale.ROOT) + sen3ToUpSplit[i].substring(1).toLowerCase(Locale.ROOT) + " ";
        }
        System.out.println(mAGA);

        System.out.println("--> Q3 <--");

        /** Q3
         * reverse a string
         *
         * Lear -> Learn
         * Learn More -> More Learn
         * happy birthday to you -> you to birthday happy
         */

        String sent1 = "Learn";
        String sent2 = "Learn More";
        String sent3 = "happy birthday to you";

        String[] sent2Split= sent2.split(" ");
        String sent2Reverse= "";


        for ( int i = 1 ; i <= sent2Split.length; i++ ){
           sent2Reverse+= sent2Split[sent2Split.length-i]+" ";}
           // sent2Reverse += sent2Split[i] + " ";

            {System.out.println(sent2Reverse);}

        String [] sent3Split = sent3.split(" ");
        String sent3Reverse = "";


        for ( int i = 1 ; i <= sent3Split.length; i++ ){
            sent3Reverse += sent3Split[sent3Split.length-i] + " ";}

            {System.out.println(sent3Reverse);}


        System.out.println("--> Q4 <--");




        int[] numbers = {23, 54, 76, 12, 67, 90, 23};
        int[] numbers2 = {23, 54, 76, 12};
        int[] numbers3 = {-2, -9, -4, -7, -9, -55};


        int max = numbers[0];
        for (int i = 0; i <= numbers.length-1 ; i++) {
          if (numbers[i] > max)
                max = numbers[i];}
                    System.out.println(max);

        int max2 = numbers[0];
        for (int i = 0; i <= numbers2.length-1 ; i++) {
            if (numbers2[i] > max)
                max = numbers2[i];}
                    System.out.println(max2);

        int max3 = numbers[0];
        for (int i = 0; i <= numbers3.length-1 ; i++) {
            if (numbers3[i] > max)
                max = numbers3[i];}
        System.out.println(max3);
            }
        }


