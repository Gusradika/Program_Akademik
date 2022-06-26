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
            cetak.cetakBanner("GATE UNIVERSITAS X LITE" + dataLogin.uNameStaff.elementAt(dataLogin.loginAlias));
            cetak.cetakSpasi(1);
            System.out.println("");
            System.out.println("");
            System.out.println("5 - Clear Data Login");
            main.input = main.sc.nextInt();
            switch (main.input) {

                case 5:
                    System.out.println("CLEARING");
                    dataLogin.clearLoginCache();
                    break;
            }
        } while (true);
    }
}
