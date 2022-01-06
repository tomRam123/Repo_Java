package Practice;

import java.util.Locale;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println(helloUser("tomas"));


        System.out.println(abv("new york city"));
        System.out.println(titleCase("HappY nEW YEAR to YoU dEAr"));


        String[] set1 = {"ab", "abcd", "abc", "abcde", "defg", "koli"};
        String[] set2 = {"abcde", "jhuy", "plot", "koli"};

       for (String fromArray1 : set1)
            for (String fromArray2 : set2) {
                if (fromArray1.equalsIgnoreCase(fromArray2)) {
                    System.out.println(fromArray1.toLowerCase());

                }

            }
        }

        public static String helloUser (String userName){
            String msg = "Hello " + userName;
            return msg;
        }

        public static String abv (String sentence){
            sentence = sentence.toUpperCase(Locale.ROOT);
            String[] sentence1Array = sentence.split(" ");
            String abv = "";

            for (int i = 0; i <= sentence1Array.length - 1; i++)
                abv = abv + sentence1Array[i].charAt(0);
            return abv;
        }

        public static String titleCase (String sentence){
            String sentenceToUp = sentence.toUpperCase(Locale.ROOT);
            String[] sentenceToUpSplit = sentenceToUp.split(" ");
            String titleCase = "";

            for (int i = 0; i < sentenceToUpSplit.length; i++)
                titleCase = titleCase + sentenceToUpSplit[i].substring(0, 1).toUpperCase(Locale.ROOT) +
                        sentenceToUpSplit[i].substring(1).toLowerCase(Locale.ROOT) + " ";
            return titleCase;


        }


    }


