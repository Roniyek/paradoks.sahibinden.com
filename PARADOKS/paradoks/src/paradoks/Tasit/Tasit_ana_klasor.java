package paradoks.Tasit;
import java.util.Scanner;
public class Tasit_ana_klasor {
    private String name;
    private int max_Hiz;
    private String renk;
    private String marka;
    Scanner input=new Scanner(System.in);
    public Tasit_ana_klasor(){
        
    }
    public Tasit_ana_klasor(String name, int max_Hiz, String renk, String marka) {
        this.name = name;
        this.max_Hiz = max_Hiz;
        this.renk = renk;
        this.marka = marka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_Hiz() {
        return max_Hiz;
    }

    public void setMax_Hiz(int max_Hiz) {
        this.max_Hiz = max_Hiz;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void hizlaniyor(int max_Hiz){
        this.max_Hiz=max_Hiz;
        max_Hiz +=10;
    }
    public void Fiyat(){
        System.out.print("Alt fiyat araligini belirleyiniz:");
        int minFiyat=input.nextInt();
        System.out.print("Ust fiyat araligini belirleyiniz:");
        long maxFiyat=input.nextLong();
        System.out.println("Girilen fiyat araligi:"+minFiyat+"-"+maxFiyat);
    }
    
}
