package Class1;
public class HomeWork2 {


    public static void main(String[] args) {


        // T(°C) = (T(°F) - 32) × 5/9 = f to c
        // T(K) = (T(°F) + 459.67)× 5/9 = f to k
        // T(°F) = T(°C) × 9/5 + 32 = c to f
        // T(K) = T(°C) + 273.15 = c to k
        // T(°C) = T(K) - 273.15 = k to c
        // T(°F) = T(K) × 9/5 - 459.67 = k to f


        double fTemp = 60;
        double fahTempToCels = (fTemp- 32) * 5/9;
        double fahTempToKelv = (fTemp+459.67)* 5/9;
        double cTemp = 15.55;
        double celsTempToFah = cTemp * 9/5 + 32;
        double celsTempToKelv = cTemp + 273.15;
        double kTemp = 288.70;
        double kelvTempToCels = kTemp - 273.15;
        double kelvTempToFah = kTemp * 9/5 - 459.67;


        System.out.println(fTemp + " degrees fahrenheit to celsius = " + fahTempToCels);
        System.out.println(fTemp + " degrees fahrenheit to kelvin = " + fahTempToKelv);
        System.out.println(cTemp + " degrees celsius to fahrenheit = " + celsTempToFah);
        System.out.println(cTemp + " degrees celsius to kelvin = " + celsTempToKelv);
        System.out.println(kTemp + " kelvin to celsius degree = " + kelvTempToCels);
        System.out.println(kTemp + " kelvin to fahrenheit degrees + " + kelvTempToFah);

    }
        }



