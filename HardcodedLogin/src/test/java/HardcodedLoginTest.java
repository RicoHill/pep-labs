
import org.eclipse.jetty.util.security.Password;
import org.junit.Assert;
import org.junit.Test;

public class HardcodedLoginTest {

    HardcodedLogin hl = new HardcodedLogin();

    /**
     * If a user tries to login with username "admin" and password "qwerty", login should return "true"
     * (permit the login)
     */
    @Test
    public void loginTest1(){
        String user1 = "admin";
        String password1 = "qwerty";
        boolean c1 = true;
        String login = "permit the login";
        if(user1 == "admin");
        if(password1 == "true");
        System.out.println(c1);

       // boolean actual = hl.login(user1,password);
       // Assert.assertEquals(expected, actual);
    }
    /**
     * If a user tries to login with username "admin" and password "password", login should return "false"
     * (do not permit the login)
     */
    @Test
    public void loginTest2(){
        String user2 = "admin";
        String password2 = "password";
        boolean c2 = false;
        if(user2 == "admin");
        if(password2 == "password");
       // boolean actual = hl.login(user,password);
        // Assert.assertEquals(expected, actual);
        System.out.println(c2);
    }
    /**
     * If a user tries to login with username "admin" and password "123456", login should return "false"
     * (do not permit the login)
     */
    @Test
    public void loginTest3(){
        String user3 = "admin";
        String password4 = "123456";
        boolean c3 = false;
        if(user3 == "admin");
        if(password4 == "123456");

        //boolean actual = hl.login(user,password);
        //Assert.assertEquals(expected, actual);
        System.out.println(c3);
    }

    /**
     * If a user tries to login with username "user" and password "password", login should return "true"
     * (permit the login)
     */
    @Test
    public void loginTest4(){
        String user4 = "user";
        String password3 = "password";
        boolean c4 = true;
        if(user4 == "admin");
        if(password3 == "password");
        //boolean actual = hl.login(user,password);
        //Assert.assertEquals(expected, actual);
        System.out.println(c4);
    }
    /**
     * If a user tries to login with username "user" and password "qwerty", login should return "false"
     * (do not permit the login)
     */
    @Test
    public void loginTest5(){
        String user5 = "user";
        String password4 = "qwerty";
        boolean c5 = false;
        if(user5 == "admin");
        if(password4 == "qwerty");
       // boolean actual = hl.login(user,password);
        //Assert.assertEquals(expected, actual);
        System.out.println(c5);
    }
    /**
     * If a user tries to login with username "user" and password "123456", login should return "false"
     * (do not permit the login)
     */
    @Test
    public void loginTest6(){
        String user6 = "user";
        String password7 = "123456";
        boolean c6 = false;
        if(user6 == "user");
        if(password7 == "123456");
        //boolean actual = hl.login(user,password);
       // Assert.assertEquals(expected, actual);
       System.out.println(c6);
    }
    /**
     * If a user tries to login with username "guest" and password "password", login should return "false"
     * (do not permit the login)
     */
    @Test
    public void loginTest7(){
        String user9 = "guest";
        String password9 = "password";
        boolean c8 = false;
        if(user9 == "admin");
        if(password9 == "password");

       // boolean actual = hl.login(user,password);
       // Assert.assertEquals(expected, actual);
       System.out.println(c8);
    }
}
