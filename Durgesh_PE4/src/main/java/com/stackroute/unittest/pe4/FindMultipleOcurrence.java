package com.stackroute.unittest.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleOcurrence {

    public String multipleOccurenceUsingMatcher (String input, String pattern) {
        Pattern patternCheck = Pattern.compile(pattern);
        Matcher matcher = patternCheck.matcher(input);
        String result ="";
        int count = 0;
        while (matcher.find()) {
            count++;
            result+=("Found at:" + matcher.start() + "-" + matcher.end());
        }

        System.out.println(result);
        return result;

    }
}
