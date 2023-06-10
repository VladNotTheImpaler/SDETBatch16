package Class12;

public class Task1 {
    public static void main(String[] args) {

        String username = "Vlad";
        String password = "NotAPassword1";
        String confirmOurPassword= "NotAPassword1";

        if (username.isBlank() && password.isBlank()) {
            System.out.println("Username and Password cannot be empty");
        } else if  (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.equals(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmOurPassword)) {
            System.out.println("Password not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}

