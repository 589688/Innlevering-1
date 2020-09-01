package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class karakterb {

	public static void main(String[] args) {
		// Lese inn poengsum (heltall) 10 ganger!, skrive ut karakteren A-F for hver poengsum
		// Dvs. gå løkken 10 ganger, printe ut karakter hver gang
		// Ugyldige tall gir feilmelding
				
			
		for (int i = 1; i <= 10; ++i) {
		
			int poeng= Integer.parseInt(showInputDialog("Poengsum: "));
				
			if (poeng >= 0 && poeng <= 39) {
					System.out.println("karakter F");
			}
			
			if (poeng >= 40 && poeng <= 49) {
					System.out.println("karakter E");
			}
			
			if (poeng >= 50 && poeng <= 59) {
					System.out.println("karakter D");
			}
				
			if (poeng >= 60 && poeng <= 79) {
					System.out.println("karakter C");
			}
				
			if (poeng >= 80 && poeng <= 89) {
					System.out.println("karakter B");
			}
				
			if (poeng >= 90 && poeng <= 100) {
					System.out.println("karakter A");
			}
			if (poeng >= 100 || poeng <= 0) {
			System.out.println("Ugyldig poengsum");
			
			}
		}
		
			}
	}

