package Practice;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class TestQuestions {

    public static void main(String[] args) {

        System.out.println("--> Q1 <--");

        TestCodes solution = new TestCodes();

        int[] numbers = {23, 54, 76, 12, 67, 90, 23};
        int[] numsAsst = solution.sortarray(numbers);
        System.out.println(Arrays.toString(numsAsst));

        System.out.println("--> Q2 <--");

        int q2Input = 333;
        int q2Result = solution.addDigits(q2Input);
        System.out.println(q2Result);

        System.out.println("--> Q3 <--");

        String[] set1 = {"ab", "abcd", "abc", "abcde", "defg", "koli"};
        String[] set2 = {"abcde", "jhuy", "plot", "koli"};
        //System.out.println("Common values -> ");
        solution.printCommonInArray(set1, set2);

        System.out.println("--> Q4 <--");

        int[] q4Array = {23, 54, 67, 12, 34, 23, 56};
        int intRemove = 23;
        int[] q4Result = solution.removeIntFrommArray(intRemove, q4Array);
        System.out.println(Arrays.toString(q4Result));


        System.out.println("\n--> Q5 <--");

        String word1 = "level";
        String word2 = "Eye";
        boolean q5Result = solution.isStringPalindrome(word1);
        System.out.println(q5Result);

    }

}