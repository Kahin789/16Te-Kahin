package KryptoClass;

import java.util.Scanner;

public class KryptoClass {

	static int[][] string1 = {
  { 0, 5, 0, 4, 0, 2, 0, 6, 0 },
  { 0, 7, 4, 0, 8, 0, 9, 1, 0 },
  { 9, 6, 0, 0, 0, 0, 0, 5, 4 },
  { 0, 0, 0, 2, 1, 6, 0, 0, 0 },
  { 2, 0, 3, 0, 0, 9, 6, 0, 0 },
  { 0, 1, 0, 3, 5, 7, 0, 0, 8 },
  { 3, 4, 0, 0, 8, 0, 0, 7, 5 },
  { 0, 2, 6, 0, 1, 0, 1, 3, 0 },
  { 0, 9, 0, 7, 0, 1, 0, 4, 0 }
} ;
    
    // De h�r siffrorna kan du v�lja mellan och sedan s�tta en bokstav f�r. Jag valde att g�ra s� att man kan see bokstaven bredvid siffran. F�r att kunna see b�ttre och tydligare.
    
    
    static int sizeX = 9;
    static int sizeY = 9;
    static char[][] string2 = new char [sizeY][sizeX];
    public static void main(String[] args) {
    	 System.out.println("+--+--+--+--+--+--+--+--+--+");
        for(int i=0;i<sizeX;i++){
            for(int j=0;j<sizeY;j++){
                System.out.print(string1[i][j]);
                System.out.print(" |");
                
                
            }
            
        System.out.println("|");
        
        }
        
        
        // De h�r koderna �r till utseendet och hur stor storleken ska vara av Krypto korsodet. 
        
        int n=0;
        while(n != -1){
        Scanner reader = new Scanner(System.in);
        System.out.print("\n Nummer: ");
        n = reader.nextInt(); 
        System.out.print("\n Bokstav: ");
        char c = reader.next(".").charAt(0);
        
        // De h�r koderna �r till f�r att skriva vilken nummer du vill ha och vilken bokstav.
        

        for(int i=0;i<sizeX;i++){
            for(int j=0;j<sizeY;j++){
                if(n==string1[i][j]){
                	string2[i][j] = c;
                }
            }
        }
        
        
        
        for(int i=0;i<sizeX;i++){
            for(int j=0;j<sizeY;j++){
                System.out.print(" "+ string1[i][j] + string2[i][j]);
            }
            
        System.out.println("|");
        System.out.println("+--+--+--+--+--+--+--+--+--+"); // De h�r koderna anv�nds till att l�gga saker i krypto, det kan vara utseendet av krypto, i n�sta del av omg�ngen.
        
        }
            
        }
   
}
    
}


