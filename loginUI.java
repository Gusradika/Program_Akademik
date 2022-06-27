import java.util.*;

import javax.security.auth.login.LoginException;

import java.io.*;

public class loginUI {
    public static void loginAsStaff() throws LoginException, IOException {
        // hapus cahce login.alias, roles name, Roles ID
        do {
            if (checkID.debugMode) {
                cetak.cetakSpasi(1);
                cetak.cetakBannerDebug("#### INFO LOGIN ####");
                System.out.println("Name : " + dataLogin.uNameStaff.elementAt(dataLogin.loginAlias));
                System.out.println("Login Alias [ID] : " + dataLogin.loginAlias);
                System.out.println("Roles ID : " + dataLogin.rolesID);
                System.out.println("Roles Name : " + dataLogin.rolesName);
                cetak.cetakSpasi(1);
            }
            cetak.cetakBanner("       GATE UNIVERSITAS X LITE || LOGGED IN AS STAFF       ");
            cetak.news();
            System.out.println("***************************************************************");
            System.out.print(cetak.ANSI_CYAN + "Welcome Back! : " + cetak.ANSI_RESET
                    + dataLogin.realName + " " + cetak.ANSI_CYAN
                    + cetak.ANSI_YELLOW + "(STAFF "
                    + dataLogin.rolesName + ")" + cetak.ANSI_RESET);
            cetak.cetakSpasi(2);
            dataLogin.rolesBasedMenu();

        } while (true);
    }
}