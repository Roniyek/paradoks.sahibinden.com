package paradoks.Elektronik_Esya;

public class Bilgisayar extends Elektronik_ana_klasor{
    public String usb_Giris;
    public int ram;
    public boolean parmakİzi;
    public String islemciDurumu;
    protected int ssd;
    public int cekirdek_sayi;
    public int sec;
    public int secim;
  Elektronik_ana_klasor elek=new Elektronik_ana_klasor();
    //ram giris sayisi
    public int ramMiktari(){
        System.out.print("Istenilen ram sayisi: ");
        ram=input.nextInt();
        input.nextLine();
        if(ram==8){
            System.out.println("Istenilen ram (8) sayisi bulunmaktadir.");
            
        }
        else if (ram==16) {
            System.out.println("Istenilen ram (16) sayisi bulunmaktadir.");
        }
        
        else{
            System.out.println("Istenilen ram sayisi bulunmamaktadir.");
            return ramMiktari();
        }
        return 0;
    }
    //usb türü
    public int usbTuru(){
        System.out.println("1-Type-C\n"
                + "2-Usb");
        System.out.print("Tercih edilen usb giris Turu:");
        secim=input.nextInt();
        input.nextLine();
        switch (secim) {
            case 1:
                System.out.println("Tercih ettiginiz giris Type-C");
                break;
                case 2:
                System.out.println("Tercih ettiginiz giris Usb");
                break;
            default:
                System.out.println("Boyle bir tercih bulunamadi.");
                return usbTuru();
        }
      return 0;
        }
  
  public String Marka(String marka){
     
      
      System.out.println("Lenova\n"
              + "Huawei\n"
              + "Apple");
      System.out.println("Marka giriniz: ");
      marka=input.nextLine();
      setMarka(marka);
      
      if(marka.equalsIgnoreCase("Apple")||marka.equalsIgnoreCase("Lenova")||marka.equalsIgnoreCase("Huawei")){
          
      }
     else if(marka.equalsIgnoreCase("apple")||marka.equalsIgnoreCase("lenova")||marka.equalsIgnoreCase("huawei")){
         
      }
     else{
          System.out.println("Istenilen marka bulunamadi!!!");
          return Marka(marka);
     }
      return null;
      
  }
    public void sonuc(){
        if(secim==1){
            System.out.println(getMarka()+" marka Type-C girisli "+ram+"Gb ram' sahip bilgisayar alindi...");
           
        }
        else if(secim==2){
           System.out.println(getMarka()+" marka Usb girisli "+ram+"Gb ram' sahip bilgisayar alindi..."); 
        }
        else{
            System.out.println("Malesef kriterlerinize uygun bilgisayar bulunamadi...");
        }
    }
}
