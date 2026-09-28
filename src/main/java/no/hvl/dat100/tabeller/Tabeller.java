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

		String resultat = "[";

		for(int i = 0; i < tabell.length; i++){


			if(i == tabell.length - 1){
				resultat = resultat + Integer.toString(tabell[i]);
			} else {
				resultat = resultat + Integer.toString(tabell[i]) + ",";
			}

		}
		resultat = resultat + "]";


		return resultat;
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

        for (int j : tabell){
            if (j == tall){
                return true;
            }
        }
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
		for(int i = 0; i < tabell.length; i++){
			if(tabell[i] == tall){
				pos = i;
				break;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] tbl = new int[tabell.length];
		int j = 0;

		for(int i = tabell.length - 1; i >= 0; i--){
			if(j <= tabell.length - 1) {
				tbl[j] = tabell[i];
				j++;
			}else {
				break;
			}
		}
		return tbl;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 1; i < tabell.length; i++){
				if(tabell[i - 1] > tabell[i]){
					return false;
				}
		}
		return true;

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
