import java.util.*;

public class cetak {
	public static Scanner sc = new Scanner(System.in);

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

	public static void cetakBannerLogin(String kata) {
		cetakSpasi(1);
		int panjangGaris = kata.length();
		System.out.println();
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
		System.out.println(ANSI_GREEN + "* " + kata + " *" + ANSI_RESET);
		for (int i = 0; i < (panjangGaris + 4); i++) {
			System.out.print("#");
		}
		System.out.println();
	}

	public static void errormsg1(String kata_error) {
		cetakSpasi(1);
		System.out.println("### " + ANSI_RED_BG + kata_error + ANSI_RESET + " ###");
		cetakSpasi(1);
	}

	// Declaring ANSI_RESET so that we can reset the color
	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED_BG = "\u001B[41m";
	public static final String ANSI_YELLOW_BG = "\u001B[43m";
	// Declaring the color
	// Custom declaration
	public static final String ANSI_YELLOW = "\u001B[33m";

}