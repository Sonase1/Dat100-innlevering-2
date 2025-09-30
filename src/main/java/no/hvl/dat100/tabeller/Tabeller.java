package no.hvl.dat100.tabeller;
import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        System.out.println(tabell);

	}

	// b)
	public static String tilStreng(int[] tabell) {

		return Arrays.toString(tabell);
	}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0;i<tabell.length;i++) {
            if(tall == tabell[i]) {
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i<tabell.length;i++){
            if(tall == tabell[i]){
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nyTabell = new int[tabell.length];
        for(int i = 0; i < tabell.length; i++) {
            nyTabell[i] = tabell[tabell.length-1-i];
        }
        return nyTabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
        int lastDigit = 0;
        for(int i = 0; i < tabell.length-1;i++) {
            if(!(tabell[i] > lastDigit)) {
                return false;
            } else {
                lastDigit = tabell[i];
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] combined = Arrays.stream(new int[][]{tabell1, tabell2})
                .flatMapToInt(Arrays::stream)
                .toArray();

        return combined;
    }
}


