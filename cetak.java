import java.util.*;

public class cetak {
	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();
	public static int rangeRand = 11, rangeNilai = 100;
	public static String news = "Akan ada Donor darah yang dilakukan pada tanggal 15 September!";

	public static void cacheNilaiMhs() {
		for (int i = 1; i < dataLogin.uNameStudent.size(); i++) {
			for (int j = 0; j < 8; j++) {
				int random = rand.nextInt(rangeNilai);
				dataLogin.nilaiMhs[i][j] = random;
			}
		}
	}

	// METHOD CETAK SPASI PARAMETER INT
	public static void cetakSpasi(int cetakSpasi) {
		for (int i = 0; i < cetakSpasi; i++) {
			System.out.println("");
		}
	}

	// METHOD CETAK BANNER
	public static void cetakBanner(String kata) {
		int panjangGaris = kata.length();
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
		System.out.println(ANSI_YELLOW_BG + "# " + kata + " #" + ANSI_RESET);
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
	}

	// METHOD CETAK BANNER KHUSUS LOGIN (BERWARNA)
	public static void cetakBannerLogin(String kata) {
		cetakSpasi(1);
		int panjangGaris = kata.length();
		System.out.println();
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
		System.out.println("##  " + ANSI_GREEN + kata + "  ##" + ANSI_RESET);
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
	}

	public static void cetakBannerDebug(String kata) {
		cetakSpasi(1);
		int panjangGaris = kata.length();
		System.out.println();
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
		System.out.println("##  " + ANSI_CYAN_BG + kata + ANSI_RESET + "  ##");
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
	}

	// RANDOM TEXT GENERATOR JIKA INGIN MENAMBAHKAN PASTIKAN ARRAY DAN #rangeRand#
	// MEMILIKI JUMLAH SAMA
	public static String randomLoginText() {
		int int_random = rand.nextInt(rangeRand);

		// CONTROL RANDOM LOGIN TEXT
		String[] randomText = { "Have a nice Coffee", "Ba-Dum-Tss", "Wish you a sweet goodluck",
				"Dont forget to do your assignment", "Learn to Fly", "Everything has a starting point",
				"Never give up, Never surrender", "Wish you all the best", "Pratices Makes Perfect",
				"Theres always time to study",
				"Knowledge is imaginable treasure" };
		return randomText[int_random];
	}

	public static void news() {
		System.out.println(ANSI_YELLOW + "[NEWS : " + news + "]" + ANSI_RESET);
	}

	public static String accessNo() {
		String a = "\u001B[31m" + "<N>" + "\u001B[0m";
		return a;
	}

	public static String accessOk() {
		String a = "\u001B[32m" + "<Y>" + "\u001B[0m";
		return a;
	}

	public static String accessSoon() {
		String a = "\u001B[33m" + "<?>" + "\u001B[0m";
		return a;
	}

	public static String accessNeutral() {
		String a = "\u001B[36m" + "<X>" + "\u001B[0m";
		return a;
	}

	// ###################### ANSI CONTROL #######################
	// Declaring ANSI_RESET so that we can reset the color
	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED_BG = "\u001B[41m";
	public static final String ANSI_YELLOW_BG = "\u001B[43m";
	public static final String ANSI_CYAN_BG = "\u001B[46m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_GREEN_BG = "\u001B[42m";
	// Declaring the color
	// Custom declaration\u001B[36m
	public static final String ANSI_YELLOW = "\u001B[33m";

}