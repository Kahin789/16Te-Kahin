import java.util.Scanner;
public class R�varspr�ket {
	
	// Vad? R�varspr�ket �r n�r ord �ndras till att man s�tter in o i mellan meningarna. Exempel om man skriver Hey. S� blir det Hohey
	
	//Hur? Jag gjorde p� det h�r s�ttet:


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Type in a sentece:");
			String input = scanner.nextLine().toLowerCase();
			String done = ""; // H�r skriver jag en kod f�r att kunna l�sa av meningen.
			
			char kon[] = "bcdfghjklmnpqrstvwxz".toCharArray();
			char rovar[] = input.toCharArray(); // Har skriver jag ord s� att systemet kan l�sa av orden.	
			
			System.out.println ("P� r�varspr�k:"); // H�r skriver jag kod f�r att kunna �vers�tta ordet till r�varspr�ket. Exempel l�gga in o.
			for(int i = 0; i < rovar.length; i++){
				String add = "";
				for(int y = 0; y < kon.length; y++){
					if(rovar[i] == kon[y]){
						add = "o" + Character.toString(rovar[i]); 
						break;
					}
				}
				done = done + Character.toString(rovar[i]) + add;
			}

			System.out.println(done);

		}

	}