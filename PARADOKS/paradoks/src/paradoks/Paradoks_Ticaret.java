package paradoks;

public class Paradoks_Ticaret {
    public static void main(String[] args) throws Exception {
    ParadoksFiltre filtre=new ParadoksFiltre();
    VeriTabani giriss = new VeriTabani();
    
    	int gir = giriss.AnaGiris();
    	filtre.paradoks();
		
    }
}
