import java.io.IOException;

import javax.security.auth.login.LoginException;

public class inputCheck {

    public static void backToLandingPage() throws IOException, LoginException {
        checkID.username1 = "";
        checkID.username2 = "";
        checkID.passwords1 = "";
        checkID.passwords2 = "";
        checkID.landingPage();
    }

    // ERROR MESSAGE HARUSNYA DI PINDAH KE INPUTCHECK
    public static void errormsg1(String kata_error) {
        cetak.cetakSpasi(1);
        System.out.println("### " + cetak.ANSI_RED_BG + kata_error + cetak.ANSI_RESET + " ###");
        cetak.cetakSpasi(1);
    }

    // ERROR MESSAGE TANPA PEMBATAS DI AWAL DAN DI AKHIR
    public static void errormsg2(String kata_error) {
        System.out.print(cetak.ANSI_RED_BG + kata_error + cetak.ANSI_RESET);
    }

    public static boolean loginCheck1() throws IOException {
        cetak.cetakSpasi(2);
        System.out.println("Checking...");

        for (int i = 0; i < dataLogin.uNameStaff.size(); i++) {

            String a = dataLogin.uNameStaff.elementAt(i);
            String b = dataLogin.passStaff.elementAt(i);
            if (checkID.username1.equals(a) && checkID.passwords1.equals(b)) {
                cetak.cetakSpasi(1);
                System.out.println(cetak.ANSI_GREEN_BG + "Sucess..." + cetak.ANSI_RESET);
                dataLogin.loginAlias = i;
                return true;
            }
        }
        cetak.cetakSpasi(1);
        System.out.println(cetak.ANSI_RED_BG + "Fail..." + cetak.ANSI_RESET);
        dataLogin.staffAccess = false;
        return false;

    }

    public static boolean loginCheck2() throws IOException {
        cetak.cetakSpasi(2);
        System.out.println("Checking...");

        for (int i = 0; i < dataLogin.uNameStudent.size(); i++) {

            String a = dataLogin.uNameStudent.elementAt(i);
            String b = dataLogin.passStudent.elementAt(i);
            if (checkID.username2.equals(a) && checkID.passwords2.equals(b)) {
                cetak.cetakSpasi(1);
                System.out.println(cetak.ANSI_GREEN_BG + "Sucess..." + cetak.ANSI_RESET);
                dataLogin.loginAlias = i;
                return true;
            }
        }
        cetak.cetakSpasi(1);
        System.out.println(cetak.ANSI_RED_BG + "Fail..." + cetak.ANSI_RESET);
        return false;

    }

}
