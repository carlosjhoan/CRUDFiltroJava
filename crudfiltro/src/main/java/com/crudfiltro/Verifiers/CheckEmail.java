package com.crudfiltro.Verifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {

    public static boolean check(String email) {

        boolean verifyEmail = false;

        // Expresión regular para verificar el email
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}"); 
        Matcher matcher = pattern.matcher(email);
        
        verifyEmail = matcher.find();

        return verifyEmail;

    }

}
