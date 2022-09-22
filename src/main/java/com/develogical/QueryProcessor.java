package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Imperial";
        }
        if (query.length()==0){
            return "";
        }
        String[] number_strs = query.split(":");
        String num_str = number_strs[number_strs.length-1];
        String[] numbers = num_str.split(",");
        int max = 0;
        for (String num_s : numbers){
            int num = Integer.parseInt(num_s.substring(1));
            if (num > max){
                max = num;
            }
        }

        return String.valueOf(max);
    }
}
