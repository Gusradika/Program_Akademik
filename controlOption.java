import java.io.IOException;

import javax.security.auth.login.LoginException;

public class controlOption {
    // OPTION UNTUK DEBUG MODE. PERMAINKAN BOOLEAN AGAR MEMUDAHKAN PENGAKTIFAN
    // DEBUG_MODE
    // contoh
    // debug_mode_1 = ON // DEBUG_MODE_1 = Mewakili Print Data untuk login. apakah
    // aktif atau tidak
    // debug_mode_2 = OFF // DEBUG_MODE_1 = Mewakili Print Data untuk login. apakah
    // aktif atau tidak

    public static void menuNews() throws IOException, LoginException {

        cetak.cetakSpasi(2);
        System.out.println(cetak.ANSI_YELLOW_BG + " #### [1] UPDATE NEWS ####" + cetak.ANSI_RESET);
        System.out.println("News yang sekarang :");
        cetak.news();
        cetak.cetakSpasi(1);
        System.out.println("[1] - Perbarui Berita / Pengumuman");
        System.out.println("[0] - Back");
        System.out.print("Masukan inputan >");
        main.input = main.sc.nextInt();
        if (main.input == 1) {
            String a = cetak.news;
            System.out.print("Masukan News yang baru [0 = back] : ");
            cetak.news = checkID.br.readLine();
            if (cetak.news.equals("0")) {
                cetak.news = a;
            } else {
                cetak.cetakSpasi(1);
                System.out.print("OLD NEWS : " + cetak.ANSI_YELLOW + a + cetak.ANSI_RESET + "\nNEW NEWS : "
                        + cetak.ANSI_YELLOW + cetak.news + cetak.ANSI_RESET);
                menuNews();
            }
        }
        if (main.input == 0) {
            loginUI.loginAsStaff();
        } else {
            System.out.println("Inputan Salah...");
            menuNews();
        }
    }
}
