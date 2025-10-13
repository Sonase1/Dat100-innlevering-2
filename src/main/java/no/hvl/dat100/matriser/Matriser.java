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
        int rader = matrise.length;
        int kolonner = matrise[0].length;
        int[][] nyMatrise = new int[rader][kolonner];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                nyMatrise[j][i] = matrise[i][j];
            }
        }
        return nyMatrise;
    }
    
}
