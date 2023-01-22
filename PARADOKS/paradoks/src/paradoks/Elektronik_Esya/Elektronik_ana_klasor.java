package paradoks.Elektronik_Esya;
import java.util.Scanner;
public class Elektronik_ana_klasor {
    Scanner input=new Scanner(System.in);
    private  String name;
    
    String marka;
    private  int fiyat;
    private  int volt;
    public int sec;
    public int secim;
    public Elektronik_ana_klasor() {
        
    }

    
    public Elektronik_ana_klasor(String name,String marka, int fiyat) {
        this.name = name;
        this.marka = marka;
        this.fiyat = fiyat;
        System.out.println( name+" "+marka+" "+fiyat);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    public void setVolt(int volt) {
        this.volt = volt;
    }

    public int getVolt() {
        return volt;
    }
    public void Fiyat(){
        System.out.print("Alt fiyat araligini belirleyiniz:");
        int minFiyat=input.nextInt();
        System.out.print("Ust fiyat araligini belirleyiniz:");
        long maxFiyat=input.nextLong();
        System.out.println("Girilen fiyat araligi:"+minFiyat+"-"+maxFiyat);
        
    }
    public void yazdir(){
         System.out.print("Secmis oldugunuz secenekler assagidaki gibi firtlelenmistir:");
         System.out.println("Marka: "+marka);
        // System.out.println("ramMiktari: "+Bilgisayar.pc);
    }
}
