package br.edu.facisa.atal.util;

public class Util {

    public static boolean isBiggerThan (String string1, String string2){

        int compareble = string1.toLowerCase().compareTo(string2.toLowerCase());
        return compareble > 0;
    }



}
