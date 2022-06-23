import java.util.*;
import java.io.*;

public class checkID {
    public static Scanner sc = new Scanner(System.in);
    public static String username1, passwords1, username2, passwords2;
    public static Integer temp;

    // Menu awal untuk Check ID
    public static void landingPage() {
        do {
            cetak.cetakSpasi(1);
            cetak.cetakBanner("   PROGRAM AKADEMIK SMA X   ");
            System.out.println("[1] - Login Sebagai Pembina");
            System.out.println("[2] - Login Sebagai Pelajar");
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

                    break;
            }
        } while (main.input == 0 || main.input >= 4);
    }

    // LOGIN INFO 1 - Pembina
    public static void logininfo1() {
        do {
            cetak.cetakBannerLogin("LOGIN AS TEACHER -[String Random]"); // Bisa tambahkan penyemangat Random
            System.out.println("[0 = Back]"); // String. di cek melalui Math.Random
            cetak.cetakSpasi(1);
            System.out.print("Username : ");
            username1 = sc.nextLine();
            if (username1.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }

            System.out.print("Password : ");
            passwords1 = sc.nextLine();
            if (passwords1.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }
        } while (!dataLogin.teacherAccess);
    }

    public static void logininfo2() {
        do {
            cetak.cetakBannerLogin("LOGIN AS STUDENT - [String Random]"); // Bisa tambahkan penyemangat Random
            System.out.println("[0 = Back]"); // String. di cek melalui Math.Random
            cetak.cetakSpasi(1);
            System.out.print("Username : ");
            username2 = sc.nextLine();
            if (username2.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }

            System.out.print("Password : ");
            passwords2 = sc.nextLine();
            if (passwords2.equalsIgnoreCase("0")) {
                inputCheck.backToLandingPage();
            }
        } while (!dataLogin.studentAccess);
    }
}