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
    public static Vector<String> displayTrueNameStudent = new Vector<String>();

    public static Vector<Integer> displayStudentToDosen = new Vector<Integer>();

    public static int loginAlias = 0, rolesID = 0;
    public static String rolesName = "", realName = "";
    // ####### USER CONTROL

    public static int[][] nilaiMhs = new int[14][8];
    // 14 Baris, 8 Kolom, Baris ke 1 mewakili ID 0. MTK,MTK, IPA, IPA, IPS, IPS,
    // ENG, ENG

    public static String[] arrayRolesName = { "ADMINISTRATOR", "DOSEN MTK", "DOSEN IPA", "DOSEN IPS", "DOSEN ENG" };

    private static String[] iUserStaff = { "1", "Herlambang33", "NadimItsOkay20", "Ramatama09",
            "KhanzaOwO" };
    private static String[] iPassStaff = { "1", "asede", "2000", "123", "232" };

    private static String[] trueNameStaff = { "ADMINISTRATOR", // ADMIN 0
            "Herlambang, S.Mat, M.Mat", // MTK 1
            "Nadim Suryaprananta, S.Pd", // IPA 2
            "Raka Nambung, S.Pd, M.Pd", // IPS 3
            "Khanza Auliya, S.Pd, M.Pd" }; // B.ING 4

    private static String[] trueNameStudent = { "Aditya Kesuma", "Jasmin Suryatmi", "Maya Nasyiah",
            "Bagiya Rajata", "Elvin Rajasa", "Cayadi Hutapea", "Gamani Mahendra", "Tantri Prastuti", "Asman puji",
            "Puji Permata", "Indri Nasyiah",
            "Rina Purwanti", "Karsa Mustofa", "Daliman Gunawan" };
    // DOSWAL SETIAP NAMA STUDENT
    private static int[] studentToDosen = { 3, 2, 4, 1, 3, 2, 4, 1, 3, 2, 4, 1, 3, 2 };

    private static String[] iUserStudent = { "aditya", "Jasmin090", "Nasyiah3", "taraja", "elvin12", "Hutapadi",
            "Hendra30", "Prastuti", "Asman", "puji44", "Nasyiah",
            "Rinazelaya", "Mustofa196", "Gunawan" };
    private static String[] iPassStudent = { "123", "abc22", "321", "taraja", "elvinsiap", "embuh85", "haryanti",
            "okto73", "dirja60", "gjanuar", "fatohah",
            "4485", "azalea62", "dalimwan" };

    // NOTE : Gunakan Switch(Inputan) Case. Case 1, 5 : (artinya jika inputan 1 / 5.
    // maka dia akan masuk ke case ini)

    // cetak student SEKARANG SAMPAI : DOSWAL BUAT VARIABLE DULU DAN COCOKAN SESUAI
    // CATATAN
    // LINK KE CASE WHEN LOGIN UI BY USER
    public static void cetakStudent() throws LoginException, IOException {
        cetak.cetakSpasi(2);

        System.out.println(cetak.ANSI_YELLOW_BG + "#### [2] DETAIL PELAJAR ####" + cetak.ANSI_RESET);
        String menu[] = { "ID\t\t", "Nama\t\t\t", "Pembimbing\t\t\t", "MTK\t", "IPA\t", "IPS\t",
                "ENG\t\t"
                        + "\n=======================================================================================================\n\n" };
        cetak.cetakSpasi(1);
        System.out.println(
                "=======================================================================================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);
        }
        for (int i = 0; i < uNameStudent.size(); i++) {
            System.out.print((i + 1) + "\t\t" + displayTrueNameStudent.elementAt(i) + "\t\t"
                    + cetak.ANSI_CYAN
                    + displayTrueNameStaff.elementAt(displayStudentToDosen.elementAt(i)) + cetak.ANSI_RESET + "\t");
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.print(((nilaiMhs[i][0] + nilaiMhs[i][1]) / 2) + "\t");
                } else if (j == 1) {
                    System.out.print(((nilaiMhs[i][2] + nilaiMhs[i][3]) / 2) + "\t");
                } else if (j == 2) {
                    System.out.print(((nilaiMhs[i][4] + nilaiMhs[i][5]) / 2) + "\t");
                } else if (j == 3) {
                    System.out.print(((nilaiMhs[i][6] + nilaiMhs[i][7]) / 2) + "\t");
                }
            }
            System.out.println();
        }
        do {
            System.out.print(cetak.ANSI_YELLOW_BG + "FITUR COMING SOON " + cetak.ANSI_RESET
                    + "Masukan ID Mahasiswa [0 = Back] >");
            main.input = main.sc.nextInt();
        } while (main.input != 0);
        loginUI.loginAsStaff();
    }

    public static void cetakStudent2() throws LoginException, IOException {
        cetak.cetakSpasi(2);
        String menu1[] = { "MTK 1\t", "MTK2\t", "IPA 1\t", "IPA 2\t", "IPS 1\t", "IPA 2\t", "ENG 1\t", "ENG 2\t" };
        int a = 0, b = 1;
        switch (rolesID) {
            case 2:
                a = 0;
                b = 1;
                break;

            case 3:
                a = 2;
                b = 3;
                break;

            case 4:
                a = 4;
                b = 5;
                break;

            case 5:
                a = 6;
                b = 7;
                break;
        }

        System.out.println(cetak.ANSI_YELLOW_BG + "#### [2] DETAIL PELAJAR ####" + cetak.ANSI_RESET);

        cetak.cetakSpasi(1);
        System.out.println(
                "=======================================================================================================");
        System.out.println("ID\t\tNama\t\t\tPembimbing\t\t\t" + menu1[a] + menu1[b]);
        System.out.println(
                "=======================================================================================================");
        for (int i = 0; i < uNameStudent.size(); i++) {
            System.out.print((i + 1) + "\t\t" + displayTrueNameStudent.elementAt(i) + "\t\t"
                    + cetak.ANSI_CYAN
                    + displayTrueNameStaff.elementAt(displayStudentToDosen.elementAt(i)) + cetak.ANSI_RESET + "\t"
                    + nilaiMhs[i][a] + "\t" + nilaiMhs[i][b]);
            System.out.println();
        }
        do {
            System.out.print(cetak.ANSI_YELLOW_BG + "FITUR COMING SOON " + cetak.ANSI_RESET
                    + "Masukan ID Mahasiswa [0 = Back] >");
            main.input = main.sc.nextInt();
        } while (main.input != 0);
        loginUI.loginAsStaff();
    }

    public static void cetakStudent3() throws LoginException, IOException {
        cetak.cetakSpasi(2);

        System.out.println(cetak.ANSI_YELLOW_BG + "#### [2] DETAIL PELAJAR ####" + cetak.ANSI_RESET);
        String menu[] = { "ID\t\t", "Nama\t\t\t", "Pembimbing\t\t\t", "MTK\t", "IPA\t", "IPS\t",
                "ENG\t\t"
                        + "\n=======================================================================================================\n\n" };
        cetak.cetakSpasi(1);
        System.out.println(
                "=======================================================================================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);
        }
        for (int i = 0; i < uNameStudent.size(); i++) {
            if (displayStudentToDosen.elementAt(i) == (rolesID - 1)) {
                System.out.print((i + 1) + "\t\t" + displayTrueNameStudent.elementAt(i) + "\t\t"
                        + cetak.ANSI_CYAN
                        + displayTrueNameStaff.elementAt(displayStudentToDosen.elementAt(i)) + cetak.ANSI_RESET + "\t");
                for (int j = 0; j < 4; j++) {

                    if (j == 0) {
                        System.out.print(((nilaiMhs[i][0] + nilaiMhs[i][1]) / 2) + "\t");
                    } else if (j == 1) {
                        System.out.print(((nilaiMhs[i][2] + nilaiMhs[i][3]) / 2) + "\t");
                    } else if (j == 2) {
                        System.out.print(((nilaiMhs[i][4] + nilaiMhs[i][5]) / 2) + "\t");
                    } else if (j == 3) {
                        System.out.print(((nilaiMhs[i][6] + nilaiMhs[i][7]) / 2) + "\t");
                    }
                }
                System.out.println();
            }

        }
        do {
            System.out.print(cetak.ANSI_YELLOW_BG + "FITUR COMING SOON " + cetak.ANSI_RESET
                    + "Masukan ID Mahasiswa [0 = Back] >");
            main.input = main.sc.nextInt();
        } while (main.input != 0);
        loginUI.loginAsStaff();
    }

    public static void userCache() {
        addUserStaff();
        addUserStudent();
        cetak.cacheNilaiMhs();
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
            displayStudentToDosen.add(studentToDosen[i]);
            displayTrueNameStudent.add(trueNameStudent[i]); // ACTUAL NAME Student
        }
    }

    // ##################### CEK ROLES ######################
    public static void loginRolesStaff() throws LoginException, IOException {
        int a = dataLogin.loginAlias;
        switch (a) {
            case 0: // ROLES OUTPUT 0 = ADMIN
                rolesID = 1;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 1: // ROLES OUTPUT 1 = DOSEN MTK
                rolesID = 2;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 2: // ROLES OUTPUT 2 = DOSEN IPA
                rolesID = 3;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 3: // ROLES OUTPUT 1 = DOSEN IPS
                rolesID = 4;
                rolesName = arrayRolesName[(rolesID - 1)];
                realName = displayTrueNameStaff.elementAt(a);
                loginUI.loginAsStaff();
                break;
            case 4: // ROLES OUTPUT 1 = DOSEN BING
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
        do {
            if (rolesID == 1) { // ADMIN
                System.out.println("[1]" + " - Update News " + cetak.accessOk()); // Y
                System.out.println("[2]" + " - Detail Pelajar " + cetak.accessOk()); // Y
                System.out.println("[3]" + " - Menu Quiz " + cetak.accessNo()); // N
                System.out.println("[4]" + " - Detail Pelajar Bimbingan " + cetak.accessNo()); // N
                System.out.print("[5]" + " - Log Out" + cetak.accessNeutral());
                System.out.print("\nMasukan inputan >");
                main.input = main.sc.nextInt();
                switch (main.input) {
                    case 1:
                        controlOption.menuNews();
                        break;

                    case 2:
                        cetakStudent();
                        break;

                    case 3:
                        cetak.cetakSpasi(2);
                        System.out.println(cetak.ANSI_RED_BG + "NO ACCESS!" + cetak.ANSI_RESET);
                        loginUI.loginAsStaff();
                        break;
                    case 4:
                        cetak.cetakSpasi(2);
                        System.out.println(cetak.ANSI_RED_BG + "NO ACCESS!" + cetak.ANSI_RESET);
                        loginUI.loginAsStaff();
                        break;
                    case 5:
                        clearLoginCache();
                        break;
                }
            }
            if (rolesID == 2 || rolesID == 3 || rolesID == 4 || rolesID == 5) { // NOT ADMIN
                System.out.println("[1]" + " - Update News " + cetak.accessNo()); // N
                System.out.println("[2]" + " - UpdateDetail Pelajar " + cetak.ANSI_GREEN + rolesName
                        + cetak.ANSI_RESET + " " + cetak.accessOk());
                System.out.println("[3]" + " - Create a Test " + cetak.accessOk()); // Y (based on roles)
                System.out.println("[4]" + " - Detail Pelajar Bimbingan Anda " + cetak.accessOk()); // Y
                System.out.println("[5]" + " - Log Out " + cetak.accessNeutral()); // NOT : kesimpulan bikin kondisi
                                                                                   // baru
                                                                                   // untuk mengecek dia bisa
                // mengakses apa?
                System.out.print("\nMasukan inputan >");
                main.input = main.sc.nextInt();
                switch (main.input) {
                    case 1:
                        cetak.cetakSpasi(2);
                        System.out.println(cetak.ANSI_RED_BG + "NO ACCESS!" + cetak.ANSI_RESET);
                        loginUI.loginAsStaff();
                        break;

                    case 2:
                        cetakStudent2();
                        break;

                    case 3:

                        break;
                    case 4:
                        cetakStudent3();
                        break;
                    case 5:
                        clearLoginCache();
                        break;
                }
            }
        } while (true);

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
            System.out.println("realName : " + displayTrueNameStaff.elementAt(i));
            System.out.println("");
        }
        cetak.cetakSpasi(2);
        cetak.cetakBannerDebug("STUDENT ACCOUNT DETAIL");
        for (int i = 0; i < iUserStudent.length; i++) {
            System.out.println("##### ID [" + i + "]");
            System.out.println("Name : " + uNameStudent.elementAt(i));
            System.out.println("Pass : " + passStudent.elementAt(i));
            System.out.println("realName : " + displayTrueNameStudent.elementAt(i));
            System.out.println("");
        }

    }

}