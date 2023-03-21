package com.epam.demo;

import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if(args == null || args.size() == 0)
        {
            return false;
        } else {
            for(String arg : args){
                if (!StringUtils.isPositiveNumber(arg)){
                    return false;
                }
            }
            return true;
        }
    }
}