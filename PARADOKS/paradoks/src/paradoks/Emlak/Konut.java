package paradoks.Emlak;
public class Konut extends Emlak_ana_klasor{
    public String odaSayisi;
    public int katSayisi;
    public int binaYasi;
    public String isitmaTuru;
    public int bulunduguKat;
    
    public void odaSayisi(){
        System.out.println("1-  2+1 \n"
                + "2-  3+1 \n"
                + "3-  4+1 \n"
                + "Oda sayisi seciniz:");
        int islem=input.nextInt();
        
         input.nextLine();
      
      
      if(islem==1){
          odaSayisi="2+1";
          System.out.println(odaSayisi);
      }
    else if(islem==2){
          odaSayisi="3+1";
          System.out.println(odaSayisi);
      }
    else if(islem==3){
          odaSayisi="4+1";
          System.out.println(odaSayisi);
      }      
    
     else{
         System.out.println("Yanlis islem girdiniz!!!");
        odaSayisi();
     }
     
    }
    
    public void sonuc(){
        
            System.out.println(tapuDurumu+" olan "+isitma+" "+odaSayisi+" odali ev alindi...");
    }
}
    

