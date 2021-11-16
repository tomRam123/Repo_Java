package Class5;

import java.util.Arrays;
import java.util.Locale;

public class Homewok3 {

    public static void main(String[] args) {

        /**
         * store 100 in result if the length of sentence1 is greater then or equal to 10
         * else store 150 in result
         *
         * NOTE use Ternary Operator
         */

        String sentence1 = "Hello dear, how are you doing?";
        int sentence1Length = sentence1.length();

        int results = sentence1.length()>=10?100:150;


        System.out.println("sentence1 = " + sentence1);
        System.out.println("if the length of sentence1 is greater then or equal to 10, result will display 100 if else will display 150 ");
        System.out.println("result = " + results);

        /**
         * "Health was Earlier said to Be the ability of the body functioning WelL.";
         * replace all instances a/A with z
         *
         */


        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WelL.";
        String sentence2InLowerCase = sentence2.toLowerCase(Locale.ROOT);
        System.out.println(  "   ");
        System.out.println("sentence2 -> " + sentence2);
        System.out.println("replacing all a's with the letter z in sentence2.....");
        System.out.println(sentence2InLowerCase.replace("a","z" ));
        System.out.println("  ");


        /**
         * "Health was Earlier said to Be the ability of the body functioning WelL.";
         * print
         * 1. the length of the sentence2 value
         * 2. result if the sentence2 starts with "health" (ignoring cases)
         * 3. result if the sentence2 contains "Body" (ignoring cases)
         * 4. index of "Body" in sentence2
         *
         */


        boolean sentence2StartWithHealth = sentence2InLowerCase.startsWith("health");
        boolean sen2ContainsBody = sentence2InLowerCase.contains("body");
        String [] sentence2Split = sentence2.split(" ");



        System.out.println("sentence2 -> " + sentence2);
        System.out.println("does sentence2 start with the word health? " + sentence2StartWithHealth);
        System.out.println("the length of sentence 2 = " + sentence2.length());
        System.out.println("does sentence2 contain the word body? " + sen2ContainsBody );











    }
}
