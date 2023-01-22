package paradoks.Emlak;
public class Otel extends Emlak_ana_klasor{
    public int odaSayisi;
    public String odaTuru;//5 yıldızlı kral odası gibi
    public String Ozellikleri;//Havuz sahuna gibi
    int gun;
    public void daireTuru(){
        System.out.println("Otelimizde bulunan daire turleri asagidaki gibidir\n"
                + "1-Kral dairesi\n"
                + "2-Aile odasi\n"
                + "3-Tek kisilik\n");
        System.out.println("Lutfen size uygun daireyi seciniz:");
        int secilen=input.nextInt();
        input.nextLine();
         if(secilen==1){
          odaTuru="Kral dairesine";
          System.out.println(odaTuru);
          kralFiyat();
      }
    else if(secilen==2){
          odaTuru="Aile odasina";
          System.out.println(odaTuru);
          aileFiyat();
      }
    else if(secilen==3){
          odaTuru="Tek kisilik daireye";
          System.out.println(odaTuru);
          tekFiyat();
      }      
    
     else{
         System.out.println("Yanlis islem girdiniz!!!");
        daireTuru();
     }
    }
   public void kralFiyat(){
       System.out.println("1-Gunluk fiyat 8000Tl.");
       System.out.println("2-Gunluk fiyat 15000Tl.");
       System.out.println("3 gun ve sonrasi icin 8000*gun sayisi uzerinden hesaplanir...");
       System.out.print("Kac gun kalmak istersiniz:");
        gun=input.nextInt();
       if(gun==1){
           System.out.println("1-Gunluk Kral dairesi.");
           setFiyat(8000);
       }
       else if(gun==2){
           System.out.println("2-Gunluk Kral dairesi.");
           setFiyat(15000);
       }
       else if(gun>=3){
           System.out.println(gun+"-Gunluk Kral dairesi.");
           setFiyat(gun*8000);
       }
       else{
           System.out.println("Girdiiginiz gun sayisi negatif olamaz!!!");
       }
   }
   public void aileFiyat(){
       System.out.println("1-Gunluk fiyat 5000Tl.");
       System.out.println("2-Gunluk fiyat 8000Tl.");
       System.out.println("3 gun ve sonrasi icin 3500*gun sayisi uzerinden hesaplanir...");
       System.out.print("Kac gun kalmak istersiniz:");
       gun=input.nextInt();
       if(gun==1){
           System.out.println("1-Gunluk Aile dairesi.");
           setFiyat(4000);
       }
       else if(gun==2){
           System.out.println("2-Gunluk Aile dairesi.");
           setFiyat(7000);
       }
       else if(gun>=3){
           System.out.println(gun+"-Gunluk Aile dairesi.");
           setFiyat(gun*3500);
       }
       else{
           System.out.println("Girdiginiz gun sayisi negatif olamaz!!!");
       }
   }
   public void tekFiyat(){
       System.out.println("1-Gunluk fiyat 1000Tl.");
       System.out.println("2-Gunluk fiyat 1500Tl.");
       System.out.println("3 gun ve sonrasi icin 900*gun sayisi uzerinden hesaplanir...");
       System.out.print("Kac gun kalmak istersiniz:");
        gun=input.nextInt();
       if(gun==1){
           System.out.println("1-Gunluk Tek kisilik daire.");
           setFiyat(1000);
       }
       else if(gun==2){
           System.out.println("2-Gunluk Tek kisilik daire.");
           setFiyat(1500);
       }
       else if(gun>=3){
           System.out.println(gun+"-Gunluk Tek kisilik daire.");
           setFiyat(gun*900);
       }
       else{
           System.out.println("Girdiginiz gun sayisi negatif olamaz!!!");
       }
   }
   public void sonuc(){
       System.out.println(gun+" gun icin "+odaTuru+" "+getFiyat()+" Tl verdiniz...");
   }
}
