import java.util.Scanner;

public class KorsordClass {

	static int sizeX, sizeY;
	private static char[] nyckel;

	public static void main(String[] args) {

		System.out.println("Skriv in storkleken på ditt korsord!");
		System.out.print("Rader: ");
		Scanner in = new Scanner (System. in);
		sizeY = in.nextInt();
		System.out.print("Kolumner: ");
		sizeX = in.nextInt();
		int [][] korsord = new int [sizeX][sizeY];

		System.out.println("Skriv in en rad med siffror, avsluta med ENTER");
		for (int y = 0; y < sizeY; y++){
			for (int x = 0; x < sizeX; x++){
				System.out.print("Skriv in siffra på rad "+y+" : "+x+":");
				korsord[x][y] = in.nextInt();

			}


		}

		System.out.println("Korsordet ser ut så här:");
		for(int y = 0; y < sizeY; y++){
			for(int x = 0; x < sizeX; x++){
				if (nyckel [korsord [x] [y]] != ' '){
					System.out.print(nyckel[korsord[x][y]]+ " ");

				}
				else
					System.out.print(String.format("%2d", korsord [x] [y])+ " ");

			}

			System.out.println();

		}

		for (int i = 0; i<26; i++ ){
			if (nyckel [i] != ' '){
				System.out.println("Siffra " + Integer.toString(i) + " = " + nyckel [i]);
			}
		}
		System.out.println("Skriv in siffra och bokstav att byta ut den med.");
		int bytut = in.nextInt();
		String bytuttill = in.nextLine();
		nyckel[bytut] = bytuttill.charAt(1);	
	}
}

