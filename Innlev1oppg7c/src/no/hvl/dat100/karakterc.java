package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class karakterc {

	public static void main(String[] args) {
		// Lese inn poengsum (heltall) 10 ganger!, skrive ut karakteren A-F for hver poengsum
				// Dvs. gå løkken 10 ganger, printe ut karakter hver gang
				// Ugyldige tall gir feilmelding
						
					
	for (int i = 1; i <= 10; ++i) {
		
	int poeng= Integer.parseInt(showInputDialog("Poengsum: ")); 	
	
	while (poeng >= 100 || poeng <= 0)	{
		poeng = Integer.parseInt(showInputDialog("Poengsum ikke gyldig prøv igjen: "));	
		}
		
		if (poeng >= 0 && poeng <= 39) {
							System.out.println("karakter F");
		}
					
		else if (poeng >= 40 && poeng <= 49) {
							System.out.println("karakter E");
		}
					
		else if (poeng >= 50 && poeng <= 59) {
							System.out.println("karakter D");
		}
						
		else if (poeng >= 60 && poeng <= 79) {
							System.out.println("karakter C");
		}
						
		else if (poeng >= 80 && poeng <= 89) {
							System.out.println("karakter B");
		}
						
		else if (poeng >= 90 && poeng <= 100) {
							System.out.println("karakter A");
		}
		
				
	}
				
		}
			}	

	