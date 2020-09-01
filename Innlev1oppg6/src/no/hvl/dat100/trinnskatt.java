package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class trinnskatt {

	public static void main(String[] args) {
		// Lage konstanter for max-beløp per trinn, og % per trinn
		// Lage konstanter for max-skatt i hvert trinn
		// lage if løkker med < og > , beregne skatt for de øvrige nivåene ved hjelp av konstantene
		// beregne skatt på gjeldende trinn ut i fra % satsen.

		final int MAXBELOP_0= 180800;
		final int MAXBELOP_1= 254500;
		final int MAXBELOP_2= 639750;
		final int MAXBELOP_3= 999550;
		
			final double SKATT_1= 0.019;
			final double SKATT_2= 0.042;
			final double SKATT_3= 0.132;
			final double SKATT_4= 0.162;
		
				final double MAXSKATT_1= MAXBELOP_1 * SKATT_1;
				final double MAXSKATT_2= MAXBELOP_2 * SKATT_2;
				final double MAXSKATT_3= MAXBELOP_3 * SKATT_3;
				
				double lonn= Integer.parseInt(showInputDialog("Bruttolønn :"));
				
		if (lonn < MAXBELOP_0){
			showMessageDialog(null, "Ingen trinnskatt");
		}
		
		if (lonn >= MAXBELOP_0 && lonn < MAXBELOP_1) {
			double skatt= ((lonn - MAXBELOP_0) * SKATT_1);
			showMessageDialog(null, "Din trinnskatt: " + skatt);
		}
		
		if (lonn >= MAXBELOP_1 && lonn < MAXBELOP_2) {
			double skatt= (((lonn - MAXBELOP_1) * SKATT_2) + MAXSKATT_1);
			showMessageDialog(null, "Din trinnskatt: " + skatt);
		}
		
		if (lonn >= MAXBELOP_2 && lonn < MAXBELOP_3) {
			double skatt= (((lonn - MAXBELOP_2 ) * SKATT_3) + MAXSKATT_1 + MAXSKATT_2);
			showMessageDialog(null, "Din trinnskatt: " + skatt);
			
		}
		
		if (lonn >= MAXBELOP_3) {
			double skatt= (((lonn - MAXBELOP_3) * SKATT_4) + MAXSKATT_1 + MAXSKATT_2 + MAXSKATT_3);
			showMessageDialog(null, "Din trinnskatt: " + skatt);
}
	}
	}
