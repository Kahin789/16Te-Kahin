import java.awt.Graphics;
import java.util.Scanner;

public class KryptoClass {
	
	private static final int[][] Grid = null;

	static int sizeX = 10;
	static int sizeY = 10;
	
	static int krypto [] [] = new int [] []{
		{1,2,3,4,5,6,7,8,9,10},
		{7,8,3,2,5,6,1,9,4,10},
		{3,5,2,4,6,7,8,9,1,10},
		{4,5,6,3,1,2,7,8,9,10},
		{5,6,1,2,3,4,7,8,9,10}};
		
		static char key[] = new char [30];

				
		static Scanner keyb = new Scanner (System.in);
		
		
	
	static void PrintGrid(int [][] krypto, char [] nyckel){
		
		for (int i = 0; i<sizeY; i++){
			for (int j = 0; j < sizeX; j++){
				if (nyckel[krypto[i][j]] != ' ')
					System.out.print(nyckel[krypto[j][i]]+ " ");
				}
				System.out.println(":");
				
			}
			
		}
	
	static void EnterGrid(int [] [] krypto){
		for (int i = 0; i < sizeY; i++){
			String row = new String ();
			System.out.print("mata in rad "+ i+": " );
			row = keyb.nextLine();
			for (int j = 0; i < row.length()/2; j++)
				krypto[j] [i] = String.valueOf(row.substring(j*2, i*2+1));
		
		}
	}
	
	
	
	
	public static void main(String[] args) { 
	PrintGrid(Grid,key);
		System.out.println("kjkj");
	}
	
	static void println1(String stringtoprint){
		System.out.println(stringtoprint);
	}
	
	static void showGrid(int [] [] krypto, char[] key){
		for(int i = 0; i < sizeX; i++){
			for (int var1 = 0; var1 < sizeX; var1++){
				println("+--");
				
			}
			
			println("+");
			
			for(int j = 0)
			
		}
			
		}
	
	
	static void skrivUtKrypto(int[][] krypto, char [] nyckel){
		for(int y = 0;y < sizeY; y++){
			for(){
				
			}
		
	
		
		frame.setsize(600,700);
		frame.setlocation(50, 50);
		frame.setfocusable(true);
		frame.setDefaualtCloseOperation(3);
		frame.setTitle("Krypto");
		frame.add(new KryptoClass());
		frame.setResizable(true);
		frame.setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		for (int y=0; y<5; y++){
		for (int x=0; x<5; x++){
			g.drawRect(x, y, width, height);
			g.drawRect(x, y, width, height);
			g.setFont(new Font);
		}
		
	}
	
	

	public static void main1(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		println("(13) (25)");
		println("x värde och y värde");
		println("Rader; ");
		sizeY = keyboard.nextInt();
		println("kolumner; ");
		sizeX = keyboard.nextInt();
		int [][] krypto = new int [sizeY][sizeX];

	}

	private static void println(String string) {
		
	}

}