package Practice;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Locale;

public class PracticeBeforeTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 18;
        int num3 = 23;
        int num4 = -13;
        int result = (num1 + num2) - (num1 - num4) * num2 + num3 / num1;

        System.out.println("(num1 + num2) - (num1 - num4) * num2 + num3 / num1 = " + result);

        double currentTempF = 55;
        double currentTempC = (currentTempF - 32) / 1.8;

        System.out.println("\ncurrent temp is 75 degrees f coverted to celsius ->" + currentTempC);

        int creditScore = 700;
        double mortgageRate = creditScore > 700 ? 1.5 : 2.5;
        System.out.println(mortgageRate);

        creditScore = 500;
        boolean firstTimeBuyer = true;
        mortgageRate = creditScore > 600 && firstTimeBuyer == true ? 1.5 : 1.8;
        System.out.println(mortgageRate);

        String cityName = "nEW yORk CIty";
        int lenghtOfCityName = cityName.length();
        System.out.println("\nthe lenght of city name -> " + lenghtOfCityName);
        System.out.println("nEW yORk CIty in lower case -> " + cityName.toLowerCase(Locale.ROOT));
        System.out.println("nEW yORk CIty in upper case -> " + cityName.toUpperCase(Locale.ROOT));

        String cityName2 = "new york city";

        boolean cityNameEqualTo = cityName.equals(cityName2);
        System.out.println("is cityName equal to cityName2 ->" + cityNameEqualTo);
        System.out.println(cityName.equalsIgnoreCase(cityName2));
        System.out.println("");
        System.out.println(cityName);
        boolean isContains_new = cityName.contains("new");
        System.out.println(isContains_new);
        System.out.println(" next ");
        String country = "United STATES OF AMERICA";
        if (country.toLowerCase(Locale.ROOT).contains("states")) {
            System.out.println(country);
        } else {
            System.out.println("does'nt contains states");


        }
        System.out.println("\n\nreverse words");


        String[] words = {"Health", "Wealth", "pray", "happy", "joy", "smile"};

        for (int i = 1; i <= words.length; i++) {
            System.out.println(words[words.length - i]);
        }
        System.out.println("\nfoward words");
        for (int i = 0; i <= words.length - 1; i++) {
            System.out.println(words[i]);

        }
        System.out.println("\neven valeus");
        for (int i = 0; i <= words.length - 1; i +=2) {
            System.out.println(words[i]);

        }
        for (int i = 0; i <= words.length - 1; i++) {
            if (i % 2 == 0) {

                System.out.println(words[i]);
            }
        }
    }
}