import java.util.Scanner;

public class GameAdventure {

static String f�rnamn ="";
static String efternamn = "";
static String spelarnamn ="";
static int �lder ;
static char riktning ;
static String kommando = "";
static int posX = 0;
static int posY = 0;
static int pengar = 0;
static float h�lsa = 100;
private static int antalpengar;
static int monster = 1;

static void gameStory(){
System.out.println("This is a quest to find your strategy");
System.out.println("Good luck!");
}

static int probability(){
	return (int) (Math.random()*100);
}
static int probability(int max) {
	return (int) (Math.random()*max);
	
}

// Metod som pausar spelet i millis millisekunder.
static void delay(int millis){
try {
Thread.sleep(millis);
} catch (InterruptedException e) {
}
}

public static void main(String[] args) {
// Skriv ut bakgrundhistorian
gameStory();

// Skapa c�r tangentbordsskanner
Scanner sc = new Scanner(System.in);

// L�s in spelarnamn mm.

System.out.print("Choose a name. ");
f�rnamn = sc.nextLine();
System.out.print("and the family name? ");
efternamn = sc.nextLine();
System.out.print("What name should we call the city? ");
spelarnamn = sc.nextLine();
//	System.out.print("Darest you tell us thy age, please. ");
//	�lder = sc.nextInt();
do {
System.out.print("What to do? ");
kommando = sc.nextLine();

// Ta ut riktning vi ska g�.
        riktning = kommando.charAt(0);
switch (riktning) {
case 'N':
case 'n': {
	
System.out.println("We head north!");
posY -= 1;
break;
}
case 'S':
case 's':{
System.out.println("We head south!");
posY += 1;
break;
}
case 'W':
case 'w':{
System.out.println("We head west!");
posX -= 1;
break;
}
case 'E':
case 'e':{
System.out.println("We head east!");
posX += 1;
break;
}
}
System.out.println("You are at ("+posX+" , "+posY+") with health "+h�lsa);
int action = probability();
if (action == 0){ // Monster 1%
	
}
else if (action <= 10){ // NPC 10%
}
else if (action <= 15){ // Pengar
	// 1 guld 50%, 5 guld 30% och 10 guld 20%
	int antalpengar = probability();
	if (antalpengar <50)
	pengar += 1;
	else if (antalpengar <80)
	pengar += 5;
	else pengar +=10;
	}
	else if (action <= 18){ // Grop
	// Slumpa gropens djup (1-5)
	int djup = probability(5)+1;
	System.out.println("You fell into a hole and lost "+djup+" health.");
	h�lsa -= djup;
	System.out.println("Your new health is " + h�lsa);
	}



delay(1000);
System.out.println("You are at ("+posX+" , "+posY+") with health "+h�lsa);

} while (!(kommando.equalsIgnoreCase("Exit")));
System.out.println("Good Bye!");

sc.close();

}

}