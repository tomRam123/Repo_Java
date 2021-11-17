package Class6;

import java.util.Arrays;
import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {

        // Q 1

        String country = "Mexico";
        String[] countrySplit = country.split("");

        System.out.println("country name -> " + country);
        System.out.println("country length -> " + countrySplit.length);
        System.out.println(" ");


        // Q 2

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WelL.";
        String[] sentence2Split = sentence2.split(" ");
        System.out.println("sentence2 -> " + sentence2);
        System.out.println("sentence2 length -> " + sentence2Split.length);
        System.out.println(" ");


        // Q 3

        String sentence3 = "new york city";
        String sentence3ToUpper = sentence3.toUpperCase(Locale.ROOT);
        String [] sentence3ToUpperSplit = sentence3ToUpper.split(" ");
        //char nIndex = sentence3ToUpperSplit[0].charAt(0);
        //char yIndex = sentence3ToUpperSplit[1].charAt(0);
        //char cIndex = sentence3ToUpperSplit[2].charAt(0);
        //String [] NYC = nIndex + yIndex + cIndex;
        {System.out.println((sentence3ToUpperSplit[0].charAt(0)) + "" + (sentence3ToUpperSplit[1].charAt(0)) + "" + (sentence3ToUpperSplit[2].charAt(0)));}




    }




        }

