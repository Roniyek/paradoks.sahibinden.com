package paradoks.Emlak;
public class Isyeri extends Emlak_ana_klasor{
    public int katSayisi;
    public int binaSayisi;
    public int bolmeSayi;
  
    //isitma
    
    //bolme sayisi
    public int bolmesayisi(){
        System.out.println("Sadece 4 ve 6 bolmeli isyerleri mevcuttur");
        System.out.println("Kac bolme istiyorsunuz");
        int bolme=input.nextInt();
        if(bolme==4){
            System.out.println("belirttiginiz "+4+" bolmeli isyeri kaydedildi");
        }
        else if(bolme==6){
            System.out.println("belirttiginiz "+bolme+" bolmeli isyeri kaydedildi");
        }
        else{
            System.out.println("Baska bir secenek yoktur tekrar deneyiniz");
            return bolmesayisi();
        }
            
        return bolme;
        
    }
    public void sonuc(){
        
            System.out.println(bolmeSayi+" olan "+isitma+" isyeri alindi...");
    }
}
