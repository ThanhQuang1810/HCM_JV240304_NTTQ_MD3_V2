package ss6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^[a-z0-9A-Z]+@(gmail|yahoo|rikkei)\\.com$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("abc@gmail.com");
        System.out.println(m.matches());

    String    regexUsername= "^[a-z0-9A-Z]{6,}$";
        Pattern p1 = Pattern.compile(regexUsername);
            Matcher m1 = p1.matcher("abcdef");
        System.out.println(m1.matches());

    }
}
