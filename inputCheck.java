import java.io.IOException;

public class inputCheck {
    public static void backToLandingPage() throws IOException {
        checkID.username1 = "";
        checkID.username2 = "";
        checkID.passwords1 = "";
        checkID.passwords2 = "";
        dataLogin.counter = 0;
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
}
