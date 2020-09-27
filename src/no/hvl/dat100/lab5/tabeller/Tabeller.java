package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + (i < tabell.length-1 ? "," : ""));
		}
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String res = "[";
		for (int i = 0; i < tabell.length; i++) {
			res += tabell[i] + (i < tabell.length-1 ? "," : "");
		}
		res += "]";
		return res;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		
		for (int v : tabell) {
			sum += v;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int v : tabell) {
			if (v == tall) {
				return true;
			}
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

		int[] res = new int[tabell.length];
		for (int i = 0, j = tabell.length-1; i < tabell.length; i++, j--) {
			res[j] = tabell[i];
		}
		return res;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i-1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] res = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			res[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			res[i + tabell1.length] = tabell2[i];
		}
		
		return res;
	}
	
}
