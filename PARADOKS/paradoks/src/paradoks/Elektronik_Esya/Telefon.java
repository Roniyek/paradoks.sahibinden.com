package paradoks.Elektronik_Esya;
public class Telefon extends Elektronik_ana_klasor{
    public int kameraMp;
    public int pilGucu;
    protected boolean NFC;
    public int ekran_yenileme;
    public int ram;
    public int kamera;
    
    public String Marka(String marka){
        System.out.println("Huawei\n"
                + "Samsung\n"
                + "Apple\n");
        System.out.print("Markayi seciniz:");
        
      marka=input.nextLine();
      setMarka(marka);
      
      if(marka.equalsIgnoreCase("Apple")||marka.equalsIgnoreCase("Samsung")||marka.equalsIgnoreCase("Huawei")){
          
      }
     else if(marka.equalsIgnoreCase("apple")||marka.equalsIgnoreCase("samsung")||marka.equalsIgnoreCase("huawei")){
         
      }
     else{
          System.out.println("Istenilen marka bulunamadi!!!");
          return Marka(marka);
     }
      return null;
    }
    //ram giris sayisi
    public int ramMiktari(){
        System.out.print("Istenilen ram sayisi: ");
        ram=input.nextInt();
        input.nextLine();
        if(ram==4){
            System.out.println("Istenilen ram (4) sayisi bulunmaktadir.");
        }
        else if (ram==8) {
            System.out.println("Istenilen ram (8) sayisi bulunmaktadir.");
        }
        
        else{
            System.out.println("Istenilen ram sayisi bulunmamaktadir.");
            return ramMiktari();
        }
        return 0;
    }
    //kameraMp giris sayisi
    public int kameraMp(){
        System.out.print("Istenilen Kamera Mp Nedr(10-40-80-120)? ");
        kamera=input.nextInt();
        input.nextLine();
        if(kamera==10){
            System.out.println("Istenilen Kamera Mp (10) bulunmaktadir.");
        }
        else if (kamera==40) {
            System.out.println("Istenilen Kamera Mp (40) bulunmaktadir.");
        }
        else if(kamera==80){
            System.out.println("Istenilen Kamera Mp (80) bulunmaktadir.");
        }
        else if(kamera==120){
            System.out.println("Istenilen Kamera Mp (120) bulunmaktadir.");
        }
        else{
            System.out.println("Istenilen Kamera Mp  bulunmamaktadir.");
            return kameraMp();
        }
        return 0;
    }
     public void sonuc(){
        
            System.out.println(getMarka()+" marka "+ram+"Gb ram "+kamera+"Mp kameraya "+ "sahip Telefon alindi...");
    }
    
}
