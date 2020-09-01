package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class karakter {

	public static void main(String[] args) {
		// Lese inn poengsum (heltall), skrive ut karakteren A-F dette tilsvarer
		//skrive ut feilmelding dersom poengsumen er ugyldig (negativ eller over 100)
		
		
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
		else System.out.println("Ugyldig poengsum");
			
	}

}
