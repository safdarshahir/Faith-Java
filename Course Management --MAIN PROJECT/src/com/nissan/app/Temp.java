package com.nissan.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp {

    public static void main(String[] args) {

        String regex = "(?=.*[a-z])(?=.*[A-Z])([a-zA-Z*\\d]{6,20}$)";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher("");
        boolean finder = matcher.find();
        
      if(finder) {
          System.out.println("match found");
      }else {
          
          System.out.println("Description should contain an Uppercase, lowercase and Numeric value and minimum of 6-20 characters.");
      }
    }

}
