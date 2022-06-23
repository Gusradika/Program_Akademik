import java.util.*;

public class checkID {
    public static Scanner sc = new Scanner(System.in);

    // Menu awal untuk Check ID
    public static void landingpage() {
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

                    break;

                case 2:

                    break;

                case 3:

                    break;
            }
        } while (main.input == 0 || main.input >= 4);
    }

    // LOGIN INFO 1 - ADMIN
    public static void logininfo1() {
        cetak.cetakSpasi(1);
        System.out.print("[1] - ");
    }

}