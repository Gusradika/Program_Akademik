import java.io.IOException;
import java.util.*;

import javax.security.auth.login.LoginException;

public class test {

    public static int testID;

    public static String[] macamTest = { "[MTK 1]", "[MTK 2]",
            "[IPA 1]", "[IPA 2]",
            "[IPS 1]", "[IPS 2]",
            "[ENG 1]", "[ENG2]" };
    public static int[] validator = { 1, 0, // MTK
            1, 0, // IPA
            1, 0, // IPS
            1, 0, }; // ENG
    public static Stack<Integer> stackA = new Stack<Integer>();
    public static Stack<Integer> stackB = new Stack<Integer>();
    public static Vector<String> soalIPA = new Vector<String>();
    public static Random rand = new Random();
    public static int int_random, rangeRand = 11, controlSoal = 5, benar, salah, grade;
    public static double point;
    public static Scanner sc = new Scanner(System.in);
    public static int jawabStorage[][] = new int[4][99]; // {Stack A},{Stack B},{jawaban yang Benar},{Jawaban Inputan}
    public static int validasi[] = new int[99];

    public static void cekTestStudent() throws LoginException, IOException {
        do {
            cetak.cetakSpasi(2);
            int a = dataLogin.loginAlias;
            System.out.println(cetak.ANSI_YELLOW_BG + "#### Available TEST ####" + cetak.ANSI_RESET);
            for (int i = 0; i < macamTest.length; i++) {
                if (validator[i] == 1) {
                    System.out.println(
                            cetak.ANSI_GREEN + "[" + (i + 1) + "]\t" + macamTest[i] + "\t[v]" + cetak.ANSI_RESET);
                } else if (validator[i] == 0) {
                    System.out.println(
                            cetak.ANSI_RED + "[" + (i + 1) + "]\t" + macamTest[i] + "\t[x]" + cetak.ANSI_RESET);
                }
            }
            cetak.cetakSpasi(1);
            System.out.print("Masukan inputan [0 = Back] >");
            main.input = main.sc.nextInt();
            if (main.input == 0) {
                loginUI.loginAsStudent();
            }
            if (dataLogin.nilaiMhs[a][(main.input - 1)] == 0 && validator[(main.input - 1)] == 1) {
                switch (main.input) {
                    case 1:
                        tugasSoalMTK();
                        break;
                    case 2:

                        break;
                    case 3:
                        soalIPA();
                        break;
                    case 4:

                        break;
                    case 5:
                        soalIPS();
                        break;
                    case 6:

                        break;
                    case 7:
                        soalENG();
                        break;
                    case 8:

                        break;
                }
            } else {
                System.out.println(cetak.ANSI_RED_BG + "Inputan Salah!" + cetak.ANSI_RESET);
                cekTestStudent();
            }
        } while (true);
    }

    public static void cekTestStaff() throws LoginException, IOException {
        int a, b;
        switch (dataLogin.rolesID) {
            case 2:
                do {
                    cetak.cetakSpasi(2);
                    a = 0;
                    b = 1;
                    System.out.println(cetak.ANSI_YELLOW_BG + "#### [3] BUAT TEST (MTK) ####" + cetak.ANSI_RESET);
                    System.out.println("#######################");
                    System.out.print("[1] - " + macamTest[a]);
                    if (validator[a] == 0) {
                        System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                    } else if (validator[a] == 1) {
                        System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                    }
                    System.out.print("[2] - " + macamTest[b]);
                    if (validator[b] == 0) {
                        System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                    } else if (validator[b] == 1) {
                        System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                    }
                    System.out.println();
                    System.out.print("Pilih Test [0 = Back] >");
                    main.input = main.sc.nextInt();
                    if (main.input == 1 && validator[a] == 0) {
                        testID = 0;
                        // BUAT TEST
                    } else if (main.input == 2 && validator[b] == 0) {
                        testID = 1;
                        // BUAT TEST
                    } else if (main.input == 0) {
                        loginUI.loginAsStaff();
                    } else {
                        System.out.println(cetak.ANSI_RED_BG + "Inputan Salah!" + cetak.ANSI_RESET);
                    }
                } while (true);

            case 3:
                System.out.println(cetak.ANSI_YELLOW_BG + "#### [3] BUAT TEST (IPA) ####" + cetak.ANSI_RESET);
                cetak.cetakSpasi(2);
                a = 2;
                b = 3;
                System.out.println("#######################");
                System.out.print("[1] - " + macamTest[a]);
                if (validator[a] == 0) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                } else if (validator[a] == 1) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                }
                System.out.print("[2] - " + macamTest[b]);
                if (validator[b] == 0) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                } else if (validator[b] == 1) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                }
                System.out.println();
                System.out.print("Pilih Test [0 = Back] >");
                main.input = main.sc.nextInt();
                if (main.input == 1 && validator[a] == 0) {
                    testID = 2;
                    // BUAT TEST
                } else if (main.input == 2 && validator[b] == 0) {
                    testID = 3;
                    // BUAT TEST
                } else if (main.input == 0) {
                    loginUI.loginAsStaff();
                } else {
                    System.out.println(cetak.ANSI_RED_BG + "Inputan Salah!" + cetak.ANSI_RESET);
                }
                break;

            case 4:
                System.out.println(cetak.ANSI_YELLOW_BG + "#### [3] BUAT TEST (IPS) ####" + cetak.ANSI_RESET);
                cetak.cetakSpasi(2);
                a = 4;
                b = 5;
                System.out.println("#######################");
                System.out.print("[1] - " + macamTest[a]);
                if (validator[a] == 0) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                } else if (validator[a] == 1) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                }
                System.out.print("[2] - " + macamTest[b]);
                if (validator[b] == 0) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                } else if (validator[b] == 1) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                }
                System.out.println();
                System.out.print("Pilih Test [0 = Back] >");
                main.input = main.sc.nextInt();
                if (main.input == 1 && validator[a] == 0) {
                    testID = 4;
                    // BUAT TEST
                } else if (main.input == 2 && validator[b] == 0) {
                    testID = 5;
                    // BUAT TEST
                } else if (main.input == 0) {
                    loginUI.loginAsStaff();
                } else {
                    System.out.println(cetak.ANSI_RED_BG + "Inputan Salah!" + cetak.ANSI_RESET);
                }
                break;

            case 5:
                System.out.println(cetak.ANSI_YELLOW_BG + "#### [3] BUAT TEST (ENG) ####" + cetak.ANSI_RESET);
                cetak.cetakSpasi(2);
                a = 6;
                b = 7;
                System.out.println("#######################");
                System.out.print("[1] - " + macamTest[a]);
                if (validator[a] == 0) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                } else if (validator[a] == 1) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                }
                System.out.print("[2] - " + macamTest[b]);
                if (validator[b] == 0) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Belum di buat]\n" + cetak.ANSI_RESET);
                } else if (validator[b] == 1) {
                    System.out.print(cetak.ANSI_YELLOW + "\t[Test Sudah di buat]\n" + cetak.ANSI_RESET);
                }
                System.out.println();
                System.out.print("Pilih Test [0 = Back] >");
                main.input = main.sc.nextInt();
                if (main.input == 1 && validator[a] == 0) {
                    testID = 6;
                    // BUAT TEST
                } else if (main.input == 2 && validator[b] == 0) {
                    testID = 7;
                    // BUAT TEST
                } else if (main.input == 0) {
                    loginUI.loginAsStaff();
                } else {
                    System.out.println(cetak.ANSI_RED_BG + "Inputan Salah!" + cetak.ANSI_RESET);
                }
                break;
        }

    }

    public static void buatTestABCD() {
        System.out.println(cetak.ANSI_YELLOW_BG + "#### CREATE A TEST! ####" + cetak.ANSI_RESET);
    }

    public static void buatTestMTK() throws LoginException, IOException {
        boolean check = false;
        do {
            cetak.cetakSpasi(2);
            System.out.println(cetak.ANSI_YELLOW_BG + "#### CREATE A TEST! ####" + cetak.ANSI_RESET);
            System.out.println("");
            System.out.print("Masukan Jumlah Soal (MIN 1 - MAKS 5) [0 = Back] >");
            main.input = main.sc.nextInt();
            if (main.input == 0) {
                testID = 0;
                check = false;
                loginUI.loginAsStaff();

            }
            if (main.input < 0 || main.input > 5) {
                check = false;
                System.out.println(cetak.ANSI_RED_BG + "Inputan Salah!" + cetak.ANSI_RESET);
            } else {
                check = true;
            }
        } while (!check);
        // LANJUT DISINI
    }

    // ##################################################### MTK

    public static void stackRandomizer() {
        // Stack A -- defined by controlSoal
        for (int i = 0; i <= (controlSoal - 1); i++) {
            int_random = rand.nextInt(rangeRand);
            if (int_random == 0) {
                int_random += 1;
            }
            stackA.push(int_random);
            jawabStorage[0][i] = stackA.pop();
            // System.out.println(stackA.pop()); //debugger
        }
        System.out.println();

        // Stack B -- defined by controlSoal
        for (int i = 0; i <= (controlSoal - 1); i++) {
            int_random = rand.nextInt(rangeRand);
            if (int_random == 0) {
                int_random += 1;
            }
            stackB.push(int_random);
            jawabStorage[1][i] = stackB.pop();
            // System.out.println(stackB.pop()); //debugger
        }
        for (int i = 0; i <= (controlSoal - 1); i++) {
            jawabStorage[2][i] = jawabStorage[0][i] + jawabStorage[1][i];
        }
    }

    public static void tugasSoalMTK() throws LoginException, IOException {
        stackRandomizer();
        soalMTK();
    }

    public static void soalMTK() throws LoginException, IOException {
        cetak.cetakSpasi(2);
        cetak.cetakBanner("#### SOAL MTK 1 ####");
        System.out.println("Jumlah Soal : " + controlSoal + "\n\n");
        point = 100.0 / controlSoal;
        for (int i = 0; i <= (controlSoal - 1); i++) {
            System.out.print("[No." + (i + 1) + "] " + jawabStorage[0][i] + " + " + jawabStorage[1][i] + " = ");
            jawabStorage[3][i] = sc.nextInt();
            if (jawabStorage[3][i] == jawabStorage[2][i]) {
                grade += point;
                benar += 1;
                validasi[i] = 1;
            } else {
                salah += 1;
                validasi[i] = 0;
            }
        }
        cetak.cetakSpasi(1);
        cetak.cetakBanner("SUMMARY JAWABAN");
        for (int i = 0; i <= (controlSoal - 1); i++) {
            System.out.print("\n[No." + (i + 1) + "] " + jawabStorage[0][i] + " + " + jawabStorage[1][i] + " = "
                    + jawabStorage[3][i]);
            if (validasi[i] == 1) {
                System.out.print("\t(BENAR)");
            } else {
                System.out.print("\t(SALAH) Jawaban yang benar adalah : " + jawabStorage[2][i]);
            }
        }
        cetak.cetakSpasi(2);
        System.out.println("Jumlah Soal : " + controlSoal + "\nBenar : " + benar + "\nSalah : " + salah
                + "\nNilai akhir : " + grade);
        dataLogin.nilaiMhs[0][0] = grade;
        grade = 0;
        benar = 0;
        salah = 0;
        loginUI.loginAsStudent();
    }

    // ##################################################### IPA

    public static String[] storageSoalIPA = { "Nama lain dari O2 adalah?", "Aviant adalah bangsa?",
            "Spesies tidak bertulang belakang disebut juga?", "Ilmu yang mendalami pencampuran Zat adalah?",
            "Hewan yang dapat hidup pada 2 ekosistem disebut?" };
    public static String[] storageJawabIPA = { "[a] Karbohidrat", "[b] Oksigen", "[c] Karbondioksida", "[a] Tumbuhan",
            "[b] Unggas", "[c] Hewan tak bertulang belakang", "[a] Vertebrata", "[b] Invertebrata", "[c] Avertebrata",
            "[a] Kimia", "[b] Fisika", "[c] Biologi", "[a] Mamalia", "[b] Aquatic", "[c] Amphibi" };
    public static String[] jawabBenarIPA = { "b", "b", "b", "a", "c" };

    public static void soalIPA() throws IOException, LoginException {
        int a = 0;
        String[] jawabStudent = new String[5];
        cetak.cetakSpasi(2);
        cetak.cetakBanner("#### SOAL IPA 1 ####");
        System.out.println("Jumlah Soal : " + controlSoal + "\n\n");
        point = 100.0 / controlSoal;
        for (int i = 0; i <= (controlSoal - 1); i++) {
            cetak.cetakSpasi(1);
            System.out.println(cetak.ANSI_YELLOW + "[No." + (i + 1) + "] " + storageSoalIPA[i] + cetak.ANSI_RESET);
            for (int j = 0; j < 3; j++) {
                System.out.println(storageJawabIPA[a]);
                a++;
            }
            do {
                System.out.print("Jawab anda : >");
                jawabStudent[i] = checkID.br.readLine();
            } while (!jawabStudent[i].equalsIgnoreCase("a") && !jawabStudent[i].equalsIgnoreCase("b")
                    && !jawabStudent[i]
                            .equalsIgnoreCase("c"));

            if (jawabStudent[i].equalsIgnoreCase(jawabBenarIPA[i])) {
                grade += point;
                benar += 1;
                validasi[i] = 1;
            } else {
                validasi[i] = 0;
                salah += 1;
            }
        }
        cetak.cetakSpasi(1);
        cetak.cetakBanner("SUMMARY JAWABAN");
        for (int i = 0; i < controlSoal; i++) {
            System.out.print(cetak.ANSI_YELLOW + "[No." + (i + 1) + "] " + storageSoalIPA[i] + cetak.ANSI_RESET);
            if (validasi[i] == 1) {
                System.out.print("\t(BENAR)\n");
            } else {
                System.out.print("\t(SALAH) Jawaban yang benar adalah : " + jawabBenarIPA[i] + "\n");
            }
        }
        cetak.cetakSpasi(2);
        System.out.println("Jumlah Soal : " + controlSoal + "\nBenar : " + benar + "\nSalah : " + salah
                + "\nNilai akhir : " + grade);
        dataLogin.nilaiMhs[0][2] = grade;
        grade = 0;
        benar = 0;
        salah = 0;
        loginUI.loginAsStudent();
    }

    // ##################################################### IPS

    public static String[] storageSoalIPS = { "Ibu kota jakarta dahulu bernama?",
            "Kerja paksa pada zaman Belanda disebut?",
            "Perang dunia ke-2 berakhir pada tahun?", "Saat menduduki Indonesia Belanda menyerah kepada bangsa apa?",
            "Jepang datang ke indonesia dengan mengaku sebagai?" };
    public static String[] storageJawabIPS = { "[a] Bavaria", "[b] Kartanegara", "[c] Batavia", "[a] Rodi",
            "[b] Romusha", "[c] Lembur", "[a] 1945", "[b] 1944", "[c] 1943",
            "[a] India", "[b] Amerika", "[c] Jepang", "[a] Saudara Lama", "[b] Kerabat dekat", "[c] Saudara tua" };
    public static String[] jawabBenarIPS = { "c", "a", "a", "c", "c" };

    public static void soalIPS() throws IOException, LoginException {
        int a = 0;
        String[] jawabStudent = new String[5];
        cetak.cetakSpasi(2);
        cetak.cetakBanner("#### SOAL IPS 1 ####");
        System.out.println("Jumlah Soal : " + controlSoal + "\n\n");
        point = 100.0 / controlSoal;
        for (int i = 0; i <= (controlSoal - 1); i++) {
            cetak.cetakSpasi(1);
            System.out.println(cetak.ANSI_YELLOW + "[No." + (i + 1) + "] " + storageSoalIPS[i] + cetak.ANSI_RESET);
            for (int j = 0; j < 3; j++) {
                System.out.println(storageJawabIPS[a]);
                a++;
            }
            do {
                System.out.print("Jawab anda : >");
                jawabStudent[i] = checkID.br.readLine();
            } while (!jawabStudent[i].equalsIgnoreCase("a") && !jawabStudent[i].equalsIgnoreCase("b")
                    && !jawabStudent[i]
                            .equalsIgnoreCase("c"));

            if (jawabStudent[i].equalsIgnoreCase(jawabBenarIPS[i])) {
                grade += point;
                benar += 1;
                validasi[i] = 1;
            } else {
                salah += 1;
                validasi[i] = 0;
            }
        }
        cetak.cetakSpasi(1);
        cetak.cetakBanner("SUMMARY JAWABAN");
        for (int i = 0; i < controlSoal; i++) {
            System.out.print(cetak.ANSI_YELLOW + "[No." + (i + 1) + "] " + storageSoalIPS[i] + cetak.ANSI_RESET);
            if (validasi[i] == 1) {
                System.out.print("\t(BENAR)\n");
            } else {
                System.out.print("\t(SALAH) Jawaban yang benar adalah : " + jawabBenarIPS[i] + "\n");
            }
        }
        cetak.cetakSpasi(2);
        System.out.println("Jumlah Soal : " + controlSoal + "\nBenar : " + benar + "\nSalah : " + salah
                + "\nNilai akhir : " + grade);
        dataLogin.nilaiMhs[0][4] = grade;
        grade = 0;
        benar = 0;
        salah = 0;
        loginUI.loginAsStudent();
    }

    // ##################################################### ENGLISH

    public static String[] storageSoalENG = { "Orang tua disebut?",
            "Bahasa Inggris dari Kereta adalah?",
            "Chief artinya?", "Bahasa Inggris adalah bahasa resmi yang bermula pada negara? (nama negaranya sekarang)",
            "Bahasa Inggris dari Paman-Bibi adalah?" };
    public static String[] storageJawabENG = { "[a] Father & Mother", "[b] Parent", "[c] Adoption", "[a] Train",
            "[b] Ship", "[c] Plane", "[a] Koki", "[b] Ahli-Masak", "[c] Kepala suku",
            "[a] Amerika (USA)", "[b] United Kingdom", "[c] England", "[a] Uncle-Aunt", "[b] Grandfather-GrandMother",
            "[c] Oldfather-Oldmother" };
    public static String[] jawabBenarENG = { "b", "a", "c", "b", "a" };

    public static void soalENG() throws IOException, LoginException {
        int a = 0;
        String[] jawabStudent = new String[5];
        cetak.cetakSpasi(2);
        cetak.cetakBanner("#### SOAL ENG 1 ####");
        System.out.println("Jumlah Soal : " + controlSoal + "\n\n");
        point = 100.0 / controlSoal;
        for (int i = 0; i <= (controlSoal - 1); i++) {
            cetak.cetakSpasi(1);
            System.out.println(cetak.ANSI_YELLOW + "[No." + (i + 1) + "] " + storageSoalENG[i] + cetak.ANSI_RESET);
            for (int j = 0; j < 3; j++) {
                System.out.println(storageJawabENG[a]);
                a++;
            }
            do {
                System.out.print("Jawab anda : >");
                jawabStudent[i] = checkID.br.readLine();
            } while (!jawabStudent[i].equalsIgnoreCase("a") && !jawabStudent[i].equalsIgnoreCase("b")
                    && !jawabStudent[i]
                            .equalsIgnoreCase("c"));

            if (jawabStudent[i].equalsIgnoreCase(jawabBenarENG[i])) {
                grade += point;
                benar += 1;
                validasi[i] = 1;
            } else {
                salah += 1;
                validasi[i] = 0;
            }
        }
        cetak.cetakSpasi(1);
        cetak.cetakBanner("SUMMARY JAWABAN");
        for (int i = 0; i < controlSoal; i++) {
            System.out.print(cetak.ANSI_YELLOW + "[No." + (i + 1) + "] " + storageSoalENG[i] + cetak.ANSI_RESET);
            if (validasi[i] == 1) {
                System.out.print("\t(BENAR)\n");
            } else {
                System.out.print("\t(SALAH) Jawaban yang benar adalah : " + jawabBenarENG[i] + "\n");
            }
        }
        cetak.cetakSpasi(2);
        System.out.println("Jumlah Soal : " + controlSoal + "\nBenar : " + benar + "\nSalah : " + salah
                + "\nNilai akhir : " + grade);
        dataLogin.nilaiMhs[0][6] = grade;
        grade = 0;
        benar = 0;
        salah = 0;
        loginUI.loginAsStudent();
    }

}