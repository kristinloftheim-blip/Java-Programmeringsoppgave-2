package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for (int j : tabell) {
            System.out.println(j);

        }


	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i > 0) streng += ",";
			streng += tabell[i];
		}
		streng += "]";
		return streng;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

        for (int j : tabell) {
            sum = sum + j;
        }
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i : tabell) {
			if (i == tall) return true;
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] ny = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			ny[i] = tabell[tabell.length - 1 - i];
		}
		return ny;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		if (tabell.length == 0) {
			return true;
		} else {
			for (int i = 1; i < tabell.length; i++) {
				if (tabell[i] < tabell[i - 1]) return false;
			}
			return true;
		}
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int [] tbl = new int[tabell1.length + tabell2.length];

		for(int i = 0; i < tabell1.length; i++){
			tbl[i] = tabell1[i];
		}
		for(int j = 0; j < tabell2.length; j++){
			tbl[j+tabell1.length] = tabell2[j];
		}

		return tbl;

	}
}
