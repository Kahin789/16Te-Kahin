import java.util.Scanner;

public class PolindromClass {

	public static void main(String[] args) {

	String mening = new String();
	int l�ngd;
	Scanner tangentbord = new Scanner(System.in);

	System.out.print("Skriv in en mening: ");
	mening = tangentbord.nextLine();

	l�ngd = mening.length();
	System.out.println("Meningen �r "+l�ngd+" antal tecken l�ng.");

	// meningen bakl�nges.
	// jag skapar en loop som g�r fr�n slutet till b�rjan av mening
	System.out.print("Vi har v�nt p� str�ngen: ");
	for (int plats = l�ngd-1 ; plats >= 0 ; plats--){
	System.out.print(mening.charAt(plats));
	}
	System.out.println();
	// Jag ska kontrollera om str�ngen �r ett palindrom.
	// Jag anv�nder en annan metod f�r att v�nda en str�ng.

	String reversed = new StringBuilder(mening).reverse().toString();
	/* L�sning
	mening = mening.replaceAll(" ", "");
	reversed = reversed.replaceAll(" ", "");

	if(mening.equalsIgnoreCase(reversed)){
	System.out.println("Palindrom!");
	}
	*/
	if(mening.replaceAll(" ", "").equalsIgnoreCase(reversed.replaceAll(" ", "")))
	{
	System.out.println("Palindrom!");	
	}

	tangentbord.close();
	}
	}

