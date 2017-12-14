package uebung_8_2;
import javax.swing.JOptionPane;
public class Zahlenspiel {

	public static void main(String[] args) {
		int Zufallszahl = (int)((Math.random()) * 100 +1);	
		String a= JOptionPane.showInputDialog("Ich rate");
		int b = Integer.valueOf(a);
		int d=0;
		for (int c=Zufallszahl;c!=b; d=d+1){
					
			if (b<c){ System.out.println("Die Zufallszahl ist größer");}
			else {System.out.println("Die Zufallszahl ist kleiner");}
			a= JOptionPane.showInputDialog("Ich rate");
			b = Integer.valueOf(a);
			}
		System.out.println("RICHTIG!");
		}
		
	}


