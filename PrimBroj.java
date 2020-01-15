import javax.swing.JOptionPane;

public class PrimBroj {
	
	//ispis svih prime brojeva do zadanog broja

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int kojiBroj = 50000;
		int kojiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite maksimalni broj traženja prim broja."));
		int kojiBroj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite minimalni broj traženja prim broja."));
		
		for(int i = kojiBroj2; i <= kojiBroj; i++) {
			if(ProvjeriBroj(i)) {
				System.out.println("Broj " + i + " je prim broj.");
				
			}	
		}
	}

	
	//metoda koja provjerava samo jedan broj
	private static boolean ProvjeriBroj(int broj) {
		
		int ostatak;
		for(int i = 2; i<=(broj/2); i++) {
			ostatak = broj%i;
			
			if (ostatak==0) {
				return false;
			}
		
			//switch (ostatak){
			//case 0:
			//return false;
			//}
			
		}
		return true;
		
	}
	
}
