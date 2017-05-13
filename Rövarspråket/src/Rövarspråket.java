import java.util.Scanner;
public class Rövarspråket {
	
	// Vad? Rövarspråket är när ord ändras till att man sätter in o i mellan meningarna. Exempel om man skriver Hey. Så blir det Hohey
	
	//Hur? Jag gjorde på det här sättet:


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Type in a sentece:");
			String input = scanner.nextLine().toLowerCase();
			String done = ""; // Här skriver jag en kod för att kunna läsa av meningen.
			
			char kon[] = "bcdfghjklmnpqrstvwxz".toCharArray();
			char rovar[] = input.toCharArray(); // Har skriver jag ord så att systemet kan läsa av orden.	
			
			System.out.println ("På rövarspråk:"); // Här skriver jag kod för att kunna översätta ordet till rövarspråket. Exempel lägga in o.
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