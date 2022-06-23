import java.util.*;
import java.io.*;

public class checkID {
    public static Scanner sc = new Scanner(System.in);
    public static String username1, passwords1, username2, passwords2;
    public static Integer temp;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Menu awal untuk Check ID
    public static void landingPage() throws IOException {
        do {
            cetak.cetakSpasi(1);
            cetak.cetakBanner("   PROGRAM AKADEMIK SMA X   ");
            System.out.println("[1] - Login Sebagai Staff");
            System.out.println("[2] - Login Sebagai Student");
            System.out.println("[3] - Exit");
            System.out.print("Masukan Inputan  > ");
            main.input = sc.nextInt();
            if (main.input == 0 || main.input >= 4) {
                cetak.errormsg1("INPUTAN SALAH!");
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
                    System.out.println(cetak.ANSI_RED_BG + "System Exiting..." + cetak.ANSI_RESET); // Ganti Warna
                                                                                                    // menjadi bg Red
                                                                                                    // tunggu sampai
                                                                                                    // WIFI NYALA
                    System.exit(0);
                    break;
            }
        } while (main.input == 0 || main.input >= 4);
    }

    // LOGIN INFO 1 - Pembina
    public static void logininfo1() throws IOException {
        do {
            cetak.cetakBannerLogin("[LOGIN AS STAFF]" + cetak.ANSI_RESET + " || " + cetak.randomLoginText());
            System.out.println("[0 = Back]"); // String. di cek melalui Math.Random
            cetak.cetakSpasi(1);
            System.out.print("Username : ");
            username1 = br.readLine();
            if (username1.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }

            System.out.print("Password : ");
            passwords1 = br.readLine();
            if (passwords1.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }
        } while (!dataLogin.teacherAccess);
    }

    public static void logininfo2() throws IOException {
        do {
            cetak.cetakBannerLogin("[LOGIN AS STUDENT]" + cetak.ANSI_RESET + " || " + cetak.randomLoginText());
            System.out.println("[0 = Back]"); // String. di cek melalui Math.Random
            cetak.cetakSpasi(1);
            System.out.print("Username : ");
            username2 = br.readLine();
            if (username2.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }

            System.out.print("Password : ");
            passwords2 = br.readLine();
            if (passwords2.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }
        } while (!dataLogin.studentAccess);
    }
}
/*
 * ########################## DEV LOG ############################
 * Stable a0.1
 * -[v] Mengganti inputan user dari scanner menjadi Buffered Reader
 * -[v] menambahkan Random text untuk tampilan awal login
 * -[v] System Exit
 * NOTE : Tambahkan USERNAME & PASSWORD salah jika LOGIN STATUS FAIL.
 */