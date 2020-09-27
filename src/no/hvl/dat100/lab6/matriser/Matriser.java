package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++ ) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String res = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++ ) {
				res += matrise[i][j] + " ";
			}
			res += "\n";
		}
		
		return res;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] res = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				res[i][j] = matrise[i][j]*tall;
			}
		}
		
		return res;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] res = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++ ) {
				res[j][i] = matrise[i][j];
			}
		}
		
		return res;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (a[0].length != b.length) {
			return null;
		}
		
		int[][] res = new int[a.length][b[0].length];
		
		for (int j = 0; j < res.length; j++) {
			for (int i = 0; i < res[0].length; i++) {
				res[j][i] = 0;
				for (int k = 0; k < b.length; k++) {
					res[j][i] += a[j][k]*b[k][i];
				}
			}
		}
		return res;
	}
}
