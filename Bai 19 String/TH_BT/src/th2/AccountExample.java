package th2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        System.out.println(pattern);
        Matcher matcher = pattern.matcher(regex);
//        System.out.println(matcher);
//        return matcher.matches();
        return regex.matches(ACCOUNT_REGEX);
    }
}
