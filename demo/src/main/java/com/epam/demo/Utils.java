package com.epam.demo;

import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       boolean flag = true;
       for (String str : args) {
           if (!StringUtils.isPositiveNumber(str)) flag = false;
       }
       return flag;
    }
}