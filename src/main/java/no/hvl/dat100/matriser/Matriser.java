package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for(int[] liste : matrise) {
            for(int number : liste) {
                System.out.println(number);
            }
        }
    }
    }

	// b)
	public static String tilStreng(int[][] matrise) {
        String s = "";
        for(int[] liste: matrise) {
            for(int tall: liste) {
                s += tall + " ";
            }
            s += "\n";
        }
        return s;
    }

		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMatrise = new int[matrise.length][matrise[0].length];
        for(int i = 0;i<matrise.length; i++){
            for(int j = 0;j<matrise[i].length;j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;

    }

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

        return a == b;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
