package com.test.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class restUtils {

    public static String getUserName(){
        String generatedString= RandomStringUtils.randomAlphabetic(1);
        return ("john"+generatedString);
    }
}
