package StenSaxP�seClass;

import java.util.Scanner;

public class StenSaxP�seClass {
		
	public static void main(String[] args) {
		for (int i=0; i<3; i++){
			
		}
		
		int dator;
		int spelare;
		String[] alternativ = {"Sten,", "Sax", "P�se"};
		
		System.out.println("Sten Sax P�se");
		System.out.println("0 = sten, 1 = sax, 2 = p�se:");
		
		Scanner spelarval = new Scanner(System.in);

		spelare = spelarval.nextInt();
		
		spelarval.close();
		dator = (int) (Math.random()*3);
		
		System.out.println("Datorn valde: "+ alternativ[dator]);
		System.out.println("Du valde: "+ alternativ [spelare]);
		
		
		if ((spelare == 0 && dator == 1) || (spelare == 1 && dator == 2) || (spelare == 2 && dator == 0))
			System.out.println("Du vann!");		
		else if (spelare == dator )
			System.out.println("Oavgjort!");	
		else 
            System.out.println("F�rlust!");

	}
}