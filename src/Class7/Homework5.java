package Class7;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Homework5 {

    public static void main(String[] args) {

        int number = 15;



        if (number % 5 == 0) {
            System.out.println("divisible by 5");
        } else if (number % 3 == 0) {
            System.out.println("divisible by 3");
        } else if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("divisible by 3 and 5");
        } else if (number % 3 != 0 || number % 5 != 0 || number % 15 != 0) {
            System.out.println("the value of number is " + number);
        }

        double studentScore = 59;
        int maxScore = 100;
        double scoreToPercentage = studentScore / maxScore * 100;


        if (scoreToPercentage <= 100 && scoreToPercentage >= 91) {
            System.out.println(" Grade A ");
        }  else if (scoreToPercentage <= 90.99 && scoreToPercentage >= 81) {
            System.out.println("GRADE B");
        }  else if (scoreToPercentage <= 80.99 && scoreToPercentage >= 71) {
            System.out.println("GRADE C");
        }  else if (scoreToPercentage <= 70 && scoreToPercentage >= 61){
            System.out.println("GRADE D");
        }  else if (scoreToPercentage <= 61){
            System.out.println("GRADE E");


        }
    }
}