package Practice;

import java.util.Arrays;
import java.util.Locale;

public class TestCodes {





    public int[] sortarray(int[] nums) {


        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    nums[j] = nums[j] + nums[j - 1];
                    nums[j - 1] = nums[j] - nums[j - 1];
                    nums[j] = nums[j] - nums[j - 1];

                }


            }
        }
         return nums;
    }

    public int addDigits(int number) {

        int total = 0 ;
        String numberAsString = String.valueOf(number);
        String [] numberStringArray = numberAsString.split("");
        for ( String numberString : numberStringArray){
            total += Integer.valueOf(numberString);

        }
        return total;






    }

    public void printCommonInArray(String[] array1, String[] array2 ) {
        for ( String fromArray1 : array1 )
            for ( String fromArray2 : array2 ) {
                if (fromArray1.equalsIgnoreCase(fromArray2)) {
                    System.out.println(fromArray1.toLowerCase());

                }
            }






//return ans;
    }

    public int [] removeIntFrommArray(int value, int[] arr) {
        int count = 0;
        for (int num : arr ) {
            if (num == value ) {
                count++;
            }
        }
        int[] restOfValuesArr = new int [ arr.length - count];
        int j = 0;
        for (int num : arr ) {
            if (num != value) {
                restOfValuesArr[j] = num ;
                j++;

            }
        }return restOfValuesArr;
    }
    public  boolean isStringPalindrome(String word) {
        word = word.toLowerCase();
        String reverseWord = "";
        for (String alphabet : word.split("")) {
            reverseWord += alphabet;
        }
        return word.equalsIgnoreCase(reverseWord);

    }

}