package akhilshettyym.JAVA.leet.ToKnow.Practice.OOPS;

class Account {
    public String name;
    protected String email;
    private String password;

    // Getters and Setters for Private
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Interface {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Akhil";
        account1.email = "akhilshettym2003@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}