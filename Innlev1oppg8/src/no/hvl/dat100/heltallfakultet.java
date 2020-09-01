package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class heltallfakultet {

	public static void main(String[] args) {
		//Lag et program som leser inn et heltall n > 0, 
		//beregner verdien n! (n fakultet)
		//skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n.
		//altså er 5! = 1 * 2 * 3 * 4 * 5

		
		int i, fakultet=1;
		int tall = Integer.parseInt(showInputDialog("Skriv inn et heltall større enn 0: "));
		
		for(i=1; i <= tall; i++) {
			fakultet=fakultet*i;
		}
		System.out.println("Fakultet av: " + tall + " = " + fakultet);
	}

}
