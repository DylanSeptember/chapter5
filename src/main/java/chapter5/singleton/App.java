package chapter5.singleton;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Login log = Login.getInstance();
        log.loginText();
    }
}

class Login
{
    private static Login login = new Login();


    private Login()
    {}

    public static Login getInstance()
    {
        return login;
    }

    public static void loginText()
    {
        System.out.println("You have successfully Logged in");
    }

}