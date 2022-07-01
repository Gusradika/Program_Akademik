import java.util.*;

import javax.security.auth.login.LoginException;

import java.io.*;

public class checkID {
    public static Scanner sc = new Scanner(System.in);
    public static String username1, passwords1, username2, passwords2;
    public static Integer temp, counter = 0;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String temp1 = "", temp2 = "";
    public static boolean debugMode = false;

    // Menu awal untuk Check ID
    public static void landingPage() throws IOException, LoginException {
        do {
            counter = 0; // Jika selesai maka counter langsung jadikan 0 saja
            cetak.cetakSpasi(1);
            cetak.cetakBanner("   PROGRAM AKADEMIK KULIAH X   ");
            System.out.println("[1] - Login Sebagai Staff");
            System.out.println("[2] - Login Sebagai Student");
            System.out.println("[3] - Exit");
            System.out.print("Masukan Inputan  > ");
            main.input = sc.nextInt();
            if (main.input == 0 || main.input >= 4) {
                inputCheck.errormsg1("INPUTAN SALAH!");
            }
            switch (main.input) {
                case 1:
                    logininfo1();
                    break;

                case 2:
                    logininfo2();
                    break;

                case 3:
                    cetak.cetakSpasi(1);
                    System.out.println(cetak.ANSI_RED_BG + "System Exiting... " + cetak.ANSI_RESET);
                    System.exit(0);
                    break;
                case 210039:
                    if (!debugMode) {
                        System.out.println(cetak.ANSI_CYAN_BG + "Debug Mode Activated [ON]" + cetak.ANSI_RESET);
                        debugMode = true;
                        landingPage();
                    }
                    if (debugMode) {
                        System.out.println(cetak.ANSI_CYAN_BG + "Debug Mode Activated [OFF]" + cetak.ANSI_RESET);
                        debugMode = false;
                        landingPage();
                    }
                    break;
            }
        } while (main.input == 0 || main.input >= 4);
    }

    // LOGIN INFO 1 - Pembina
    public static void logininfo1() throws IOException, LoginException {

        do {
            // DEBUG MODE
            if (debugMode) {
                dataLogin.dataLogin_Debug();
            }
            cetak.cetakBannerLogin("[LOGIN AS STAFF]" + cetak.ANSI_RESET + " || " + cetak.randomLoginText());
            System.out.print("[0 = Back]\t");
            // CETAK USER&PASS ERROR
            if (counter >= 1) {
                inputCheck.errormsg2("# USERNAME ATAU PASSWORD SALAH #");
            }
            cetak.cetakSpasi(1);

            System.out.print("\nUsername : ");
            username1 = br.readLine();
            // temp1 = username1;
            // IF 0 BALIK KE LANDING PAGE
            if (username1.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }

            System.out.print("Password : ");
            passwords1 = br.readLine();
            // temp2 = passwords1;
            // IF 0 BALIK KE LANDING PAGE
            if (passwords1.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }
            counter++;
            dataLogin.staffAccess = inputCheck.loginCheck1();
        } while (!dataLogin.staffAccess);
        dataLogin.staffAccess = false;
        System.out.println("############## LOGIN BERHASIL STAFF");
        dataLogin.loginRolesStaff();
    }

    public static void logininfo2() throws IOException, LoginException {
        do {
            if (debugMode) {
                dataLogin.dataLogin_Debug();
            }
            cetak.cetakBannerLogin("[LOGIN AS STUDENT]" + cetak.ANSI_RESET + " || " + cetak.randomLoginText());
            System.out.print("[0 = Back]\t");
            // CETAK USER&PASS ERROR
            if (counter >= 1) {
                inputCheck.errormsg2("# USERNAME ATAU PASSWORD SALAH #");
            }
            cetak.cetakSpasi(1);

            System.out.print("\nUsername : ");
            username2 = br.readLine();
            // IF 0 BALIK KE LANDING PAGE
            if (username2.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }

            System.out.print("Password : ");
            passwords2 = br.readLine();
            // IF 0 BALIK KE LANDING PAGE
            if (passwords2.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }
            counter++;
            dataLogin.studentAccess = inputCheck.loginCheck2();
        } while (!dataLogin.studentAccess);
        dataLogin.studentAccess = false;
        System.out.println("############## LOGIN BERHASIL student");
        dataLogin.loginRolesStudent();

    }
}
