import java.io.IOException;
import java.util.*;

import javax.security.auth.login.LoginException;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static int input;

    public static void main(String[] args) throws IOException, LoginException {
        dataLogin.userCache();
        // System.out.println(dataLogin.uNameStaff.size());
        // System.out.println(dataLogin.uNameStaff);
        // System.out.println(dataLogin.passStaff);
        // System.out.println(dataLogin.uNameStaff.elementAt(0));
        // System.out.println(dataLogin.passStaff.elementAt(0));
        checkID.landingPage();
    }
}