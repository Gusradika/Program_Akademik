import java.util.*;
import javax.security.auth.login.LoginException;
import java.io.*;

public class dataLogin {
    public static boolean studentAccess = false, staffAccess = false;

    public static Vector<String> uNameStaff = new Vector<String>();
    public static Vector<String> passStaff = new Vector<String>();

    public static Vector<String> uNameStudent = new Vector<String>();
    public static Vector<String> passStudent = new Vector<String>();

    public static Vector<String> displayTrueNameStaff = new Vector<String>();

    public static int loginAlias = 0, rolesID = 0;
    public static String rolesName = "", realName = "";
    // ####### USER CONTROL

    public static String[] arrayRolesName = { "ADMINISTRATOR", "DOSEN MTK", "DOSEN IPA", "DOSEN IPS", "DOSEN ENG" };

    private static String[] iUserStaff = { "1", "Herlambang33", "NadimItsOkay20", "Ramatama09",
            "KhanzaOwO" };
    private static String[] iPassStaff = { "1", "asede", "2000", "123", "232" };

    private static String[] trueNameStaff = { "ADMIN UNIVERSITAS X", // ADMIN
            "Herlambang, S.Mat, M.Mat", // MTK
            "Nadim Suryaprananta, S.Pd", // IPA
            "Raka Nambung, S.Pd, M.Pd", // IPS
            "Khanza Auliya, S.Pd, M.Pd" }; // B.ING

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
            displayTrueNameStaff.add(trueNameStaff[i]); // ACTUAL NAME STAFF
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
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 2: // ROLES OUTPUT 1 = DOSEN MTK
                rolesID = 2;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 3: // ROLES OUTPUT 2 = DOSEN IPA
                rolesID = 3;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 4: // ROLES OUTPUT 1 = DOSEN IPS
                rolesID = 4;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 5: // ROLES OUTPUT 1 = DOSEN BING
                rolesID = 5;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
        }
    }

    public static void rolesBasedMenu() throws IOException, LoginException { // CONNECTED WITH CLASS LOGINUI.java dan
                                                                             // CLASS
        // controlOption
        if (rolesID == 1) { // ADMIN
            System.out.println("[1]" + " - Update News " + cetak.accessOk()); // Y
            System.out.println("[2]" + " - Detail Pelajar " + cetak.accessOk()); // Y
            System.out.println("[3]" + " - Menu Quiz " + cetak.accessNo()); // N
            System.out.println("[4]" + " - Detail Pelajar Bimbingan " + cetak.accessOk()); // Y
            System.out.print("[5]" + " - Log Out" + cetak.accessNeutral());
            System.out.print("\nMasukan inputan >");
            main.input = main.sc.nextInt();
            if (main.input == 1) {
                controlOption.menuNews();
            }
            if (main.input == 2) {

            }
        } else if (rolesID == 2 || rolesID == 3 || rolesID == 4 || rolesID == 5) { // NOT ADMIN
            System.out.println("[1]" + " - Update News " + cetak.accessNo()); // N
            System.out.println("[2]" + " - UpdateDetail Pelajar " + cetak.ANSI_GREEN + rolesName
                    + cetak.ANSI_RESET + " " + cetak.accessOk());
            System.out.println("[3]" + " - Create a Test " + cetak.accessOk()); // Y (based on roles)
            System.out.println("[4]" + " - Detail Pelajar Bimbingan " + cetak.accessOk()); // Y (based on who they
                                                                                           // teach)
            System.out.println("[5]" + " - Log Out " + cetak.accessNeutral()); // NOT : kesimpulan bikin kondisi baru
                                                                               // untuk mengecek dia bisa
            // mengakses apa?
            System.out.print("\nMasukan inputan >");
            main.input = main.sc.nextInt();
        } else {
        }
    }

    // ##################### CLEAR CACHE ######################
    public static void clearLoginCache() throws IOException, LoginException {
        // hapus cahce login.alias, roles name, Roles ID
        cetak.cetakSpasi(1);
        System.out.println(cetak.ANSI_RED_BG + "Logging out..." + cetak.ANSI_RESET);
        loginAlias = 0;
        rolesName = "(null)";
        realName = "(null)";
        rolesID = 0;
        if (checkID.debugMode) {
            cetak.cetakBannerDebug(" #### CLEARING CACHE LOGIN SUCCESS ####");
            System.out.println("loginAlias : " + loginAlias);
            System.out.println("rolesName : " + rolesName);
            System.out.println("rolesID : " + rolesID);
            System.out.println("realName : " + realName);
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
        for (int i = 0; i < iUserStudent.length; i++) {
            System.out.println("##### ID [" + i + "]");
            System.out.println("Name : " + uNameStudent.elementAt(i));
            System.out.println("Pass : " + passStudent.elementAt(i));
            System.out.println("");
        }

    }

}