package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for(int i = 0; i < matrise.length; i++){
			for(int j = 0; j < matrise[i].length; j++){
				System.out.println(matrise[i][j]);
			}
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = "";
		for (int[] tabell : matrise) {

			for (int i = 0; i < tabell.length; i++) {
				if (i < tabell.length - 1) {
					streng += tabell[i] + " ";
				} else {
					streng += tabell[i];
				}
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] skalert = new int[matrise.length][matrise[0].length];

		for(int i = 0; i < matrise.length; i++){
			for(int j = 0; j < matrise[i].length; j++){
				skalert [i][j] = matrise[i][j] * tall;
			}
		}
		return skalert;

	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) return false;
		for (int i = 0; i < a.length; i++) {

			if (a[i].length != b[i].length) return false;
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] != b[i][j]) return false;
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int [][] speil = new int[matrise.length][matrise[0].length];

		for(int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speil[i][j] = matrise[i][j];
			}
		}
		for(int i = 0; i < speil.length; i++) {
			for (int j = i + 1; j < speil[i].length; j++) {
				int temp = speil[j][i];
				speil[j][i] = speil[i][j];
				speil[i][j] = temp;
			}
			}
		return speil;

	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int multiplisert[][] = new int[a.length][a[0].length];

		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < b.length; k++){
					multiplisert[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return multiplisert;
	
	}
}
