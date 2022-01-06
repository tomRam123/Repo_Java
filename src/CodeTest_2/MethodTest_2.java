package CodeTest_2;

import java.util.Arrays;

public class MethodTest_2 {

    /**
     * Ques-1:
     * Create a method to return a max value from an input-int-array
     * points: 10
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned value -> 67
     */


    public int maxNumInArray(int[] numArray) {
        int maxnumber = 0;
        for (int i = 0; i <= numArray.length - 1; i++) {
            if (numArray[i] > maxnumber)
                maxnumber = numArray[i];
        }
        return maxnumber;

    }


    public String commonStringInArray (String[] array1, String[] array2) {
        /**
         * Ques-3:
         * Create a method to return the common Strings values in two input-String-arrays
         * points: 30
         * Note: two input-String-arrays can be of same size or different size
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * returned value -> [happy, peace]
         **/

        String ans = "";
        for (String fromArray1 : array1) {
            for (String fromArray2 : array2) {
                if (fromArray1.equalsIgnoreCase(fromArray2))
                 ans = fromArray1.toLowerCase();

            }
        }
        return ans;
    }
}