package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(str == null ||str.equals("null") || str.equals("") || str.equals(" ") || str.startsWith("0"))
        {
            return false;
        } else {
            double number = Double.parseDouble(str);
            return number > 0;
        }
    }
}
