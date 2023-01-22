package paradoks.Tasit;
public class Araba extends Tasit_ana_klasor{
    public String yakit;
    public String model;
    public int koltukSayisi;
    public void Marka(){
        System.out.println("1-Honda\n"
                + "2-BMW\n"
                + "3-Fiat\n");
         System.out.print("Hangi markayi tercih edersiniz:");
        int sec=input.nextInt();
          
      if(sec==1){
          setMarka("Honda");
          System.out.println(getMarka());
          hondaModel();
      }
    else if(sec==2){
          setMarka("BMW");
          System.out.println(getMarka());
          bmwModel();
      }
    
    else if(sec==3){
         setMarka("Fiat");
         System.out.println(getMarka());
          fiatModel();
      }
    
     else{
         System.out.println("Yanlis islem girdiniz!!!");
         Marka();
     }
    }
    public void hondaModel(){
        System.out.println("1-Honda Civic\n"
                + "2-Honda Jazz");
        System.out.println("Honda modeli seciniz: ");
        int sec=input.nextInt();
        if(sec==1){
            model="Honda Civic'li";
            System.out.println(model);
        }
        else if(sec==2){
            model="Honda Jazz'li";
            System.out.println(model);
        }
        else{
            System.out.println("Yanlis islem Sadece 1 ve 2 olarak giriniz!!!");
            hondaModel();
        }
    }
    public void bmwModel(){
        System.out.println("1-Bmw Sedan\n"
                + "2-Bmw Turismo");
        System.out.println("Bmw modeli seciniz: ");
        int sec=input.nextInt();
        if(sec==1){
            model="Bmw Sedan'lı";
            System.out.println(model);
        }
        else if(sec==2){
            model="Bmw Turismo'lu";
            System.out.println(model);
        }
        else{
            System.out.println("Yanlis islem Sadece 1 ve 2 olarak giriniz!!!");
            bmwModel();
        }
    }
    public void fiatModel(){
        System.out.println("1-Fiat Egea\n"
                + "2-Fiat Fiorino");
        System.out.println("Fiat modeli seciniz: ");
        int sec=input.nextInt();
        if(sec==1){
            model="Fiat Egea'li";
            System.out.println(model);
        }
        else if(sec==2){
            model="Fiat Fiorino'lu";
            System.out.println(model);
        }
        else{
            System.out.println("Yanlis islem Sadece 1 ve 2 olarak giriniz!!!");
            bmwModel();
        }
    }
    public void sonuc(){
        System.out.println(getMarka()+"'nin "+model+" olan modeli olan arabayi aldiniz...");
    }
  
}
