import java.util.*;

import javax.security.auth.login.LoginException;

import java.io.*;

public class dataLogin {
    public static boolean studentAccess = false, staffAccess = false;
    public static Vector<String> uNameStaff = new Vector<String>();
    public static Vector<String> passStaff = new Vector<String>();

    public static Vector<String> uNameStudent = new Vector<String>();
    public static Vector<String> passStudent = new Vector<String>();

    public static int loginAlias = 0, rolesID = 0;
    public static String rolesName = "";
    // ####### USER CONTROL

    public static String[] arrayRolesName = { "ADMIN", "DOSEN A", "DOSEN B", "DOSEN C" };

    private static String[] iUserStaff = { "Bambang39", "heru39", "Nadim20", "ashiap" };
    private static String[] iPassStaff = { "12345", "asede", "2000", "123" };

    private static String[] iUserStudent = { "aditya", "adit2", "adit3", "adit4" };
    private static String[] iPassStudent = { "123", "123", "abc", "123" };

    // NOTE : Gunakan Switch(Inputan) Case. Case 1, 5 : (artinya jika inputan 1 / 5.
    // maka dia akan masuk ke case ini)

    public static void userCache() {
        addUserStaff();
        addUserStudent();
    }

    public static void addUserStaff() {

        for (int i = 0; i < iUserStaff.length; i++) {
            uNameStaff.add(iUserStaff[i]);
            passStaff.add(iPassStaff[i]);
        }

    }

    public static void addUserStudent() {

        for (int i = 0; i < iUserStudent.length; i++) {
            uNameStudent.add(iUserStudent[i]);
            passStudent.add(iPassStudent[i]);
        }

    }

    // ##################### CEK ROLES ######################
    public static void loginRolesStaff() throws LoginException, IOException {
        int a = dataLogin.loginAlias;

        switch (a) {
            case 0, 1: // ROLES OUTPUT 0 = ADMIN
                rolesID = 1;
                rolesName = arrayRolesName[(rolesID - 1)];
                loginUI.loginAsStaff();
                break;
            case 2: // ROLES OUTPUT 1 = DOSEN A
                rolesID = 2;
                rolesName = arrayRolesName[(rolesID - 1)];
                loginUI.loginAsStaff();
                break;
            case 3: // ROLES OUTPUT 2 = DOSEN B
                rolesID = 3;
                rolesName = arrayRolesName[(rolesID - 1)];
                loginUI.loginAsStaff();
                break;
        }
    }

    // ##################### CLEAR CACHE ######################
    public static void clearLoginCache() throws IOException, LoginException {
        // hapus cahce login.alias, roles name, Roles ID
        cetak.cetakSpasi(1);
        System.out.println(cetak.ANSI_RED_BG + "Logging out..." + cetak.ANSI_RESET);
        loginAlias = 0;
        rolesName = "(null)";
        rolesID = 0;
        if (checkID.debugMode) {
            cetak.cetakBannerDebug(" #### CLEARING CACHE LOGIN SUCCESS ####");
            System.out.println("loginAlias : " + loginAlias);
            System.out.println("rolesName : " + rolesName);
            System.out.println("rolesID : " + rolesID);
        }
        checkID.landingPage();
        cetak.cetakSpasi(1);
    }

    public static void dataLogin_Debug() {
        // ############# DEBUG MODE
        cetak.cetakSpasi(2);
        cetak.cetakBannerDebug("STAFF ACCOUNT DETAIL");
        for (int i = 0; i < iUserStaff.length; i++) {
            System.out.println("##### ID [" + i + "]");
            System.out.println("Name : " + uNameStaff.elementAt(i));
            System.out.println("Pass : " + passStaff.elementAt(i));
            System.out.println("");
        }
        cetak.cetakSpasi(2);
        cetak.cetakBannerDebug("STUDENT ACCOUNT DETAIL");
        for (int i = 0; i < iUserStaff.length; i++) {
            System.out.println("##### ID [" + i + "]");
            System.out.println("Name : " + uNameStudent.elementAt(i));
            System.out.println("Pass : " + passStudent.elementAt(i));
            System.out.println("");
        }

    }

}
