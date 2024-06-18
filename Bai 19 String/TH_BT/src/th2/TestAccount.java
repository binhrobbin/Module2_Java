package th2;

import th2.AccountExample;

public class TestAccount {
    public static void main(String[] args) {
        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
        String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
        AccountExample accountExample = new AccountExample();
        for (String account:validAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String account : invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }

    }
}
