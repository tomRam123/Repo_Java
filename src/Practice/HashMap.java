package Practice;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        Map<Integer, String> students = new java.util.HashMap<>();

        students.put(1, "Deepak");
        students.put(2, "Imam");
        students.put(3, "Niki");
        students.put(4, "Philip");
        students.put(5, "Lily");
        students.put(6, "Farah");
        students.put(7, "Robin");

        System.out.println("\nstudents ->" + students);
        System.out.println("numbers of students ->"+ students.size());

        Set<Integer> allIds = students.keySet();
        System.out.println(allIds);

            for (Integer id : allIds){
                if ( id % 2 == 0 && students.get(id).length() > 4 )
                System.out.println("student id " + id + " name = " + students.get(id));
               // System.out.println(students.get(id).length());
            }

        Map<Integer, String> colors = new java.util.HashMap<>();

            colors.put( 1, "white");
            colors.put( 2, "black");
            colors.put( 3, "purple");
            colors.put( 4, "blue");
            colors.put( 5, "white");
            colors.put( 6, "purple");
            colors.put( 7 , "white");
        System.out.println("\ncolors in the hashmap"+ colors);

        Set<Integer> allcolorKeys = colors.keySet();
        System.out.println(allcolorKeys);

       // for (Integer key : allcolorKeys) {
           // if ( key);
            //System.out.println();
        }






            }











