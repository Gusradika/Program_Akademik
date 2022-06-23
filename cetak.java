import java.util.*;

public class cetak {
	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();
	public static int rangeRand = 11;

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

	// ###################### ANSI CONTROL #######################
	// Declaring ANSI_RESET so that we can reset the color
	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED_BG = "\u001B[41m";
	public static final String ANSI_YELLOW_BG = "\u001B[43m";
	// Declaring the color
	// Custom declaration
	public static final String ANSI_YELLOW = "\u001B[33m";

}