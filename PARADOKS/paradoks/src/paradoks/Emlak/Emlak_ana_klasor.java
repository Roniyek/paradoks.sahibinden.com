package paradoks.Emlak;
import java.util.Scanner;
public class Emlak_ana_klasor {
    private String name;
    private int metreKare;
    private int fiyat;
    private String konum;
    String tapuDurumu;
    public int sec;
    public String isitma;
 Scanner input=new Scanner(System.in);
public Emlak_ana_klasor(){
    
}
    public Emlak_ana_klasor(String name, int metreKare, int fiyat, String konum, String tapuDurumu) {
        this.name = name;
        this.metreKare = metreKare;
        this.fiyat = fiyat;
        this.konum = konum;
        this.tapuDurumu = tapuDurumu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMetreKare() {
        return metreKare;
    }

    public void setMetreKare(int metreKare) {
        this.metreKare = metreKare;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public String getTapuDurumu() {
        return tapuDurumu;
    }

    public void setTapuDurumu(String tapuDurumu) {
        this.tapuDurumu = tapuDurumu;
    }
    //tapu durumu
        public String tapuDurumu(){       
        System.out.println("1-Arsa tapusu\n"
                + "2-Kat mulkiyeti\n"
                + "3-Kat irtifakli\n"
                + "4-Hisse tapusu");
        System.out.print("Topu durumu seciniz:");   
         sec=input.nextInt();
      
      
      if(sec==1){
          tapuDurumu="Arsa tapusu";
          System.out.println(tapuDurumu);
      }
    else if(sec==2){
          tapuDurumu="Kat mulkiyeti";
          System.out.println(tapuDurumu);
      }
    else if(sec==3){
          tapuDurumu="Kat irtifakli";
          System.out.println(tapuDurumu);
      }      
    else if(sec==4){
          tapuDurumu="Hisse tapusu";
          System.out.println(tapuDurumu);
      }
     else{
         System.out.println("Yanlis islem girdiniz!!!");
         return tapuDurumu();
     }
     return null;
    }
    //konumu
        public String konum(String konum){
            System.out.println("1-Denizi goruyor mu?\n"
                    + "2-Ulasima yakin mi?\n"
                    + "3-Merkeze yakin mi?\n");
        System.out.print("konum ozelligini seciniz:");
         sec=input.nextInt();
         //input.nextLine();
      
      
      if(sec==1){
          konum="Denizi goruyor mu?";
          System.out.println(tapuDurumu);
      }
    else if(sec==2){
          konum="Ulasima yakin mi?";
          System.out.println(tapuDurumu);
      }
    else if(sec==3){
          konum="Merkeze yakin mi?";
          System.out.println(tapuDurumu);
      }      
    
     else{
         System.out.println("Yanlis islem girdiniz!!!");
         return konum(konum);
     }
     return null;
    }
    //fiyat
        public void Fiyat(){
        System.out.print("Alt fiyat araligini belirleyiniz:");
        int minFiyat=input.nextInt();
        System.out.print("Ust fiyat araligini belirleyiniz:");
        long maxFiyat=input.nextLong();
        System.out.println("Girilen fiyat araligi:"+minFiyat+"-"+maxFiyat);
    }
         public void isitma(){
        System.out.println("1-Dogalgazli\n"
                + "2-Sobali\n"
                + "3-Yerden isitmali\n");
        int secenek=input.nextInt();
        
        if(secenek==1){
          isitma="Dogalgazli";
          System.out.println(isitma);
      }
    else if(secenek==2){
          isitma="Sobali";
          System.out.println(isitma);
      }
    else if(secenek==3){
          isitma="Yerden isitmali";
          System.out.println(isitma);
      }      
    
     else{
         System.out.println("Yanlis islem girdiniz!!!");
        isitma();
     }
      
    }
    
    //sout ekranı
         public void sonuc(){
        
           
    }
        
}
       
        
    