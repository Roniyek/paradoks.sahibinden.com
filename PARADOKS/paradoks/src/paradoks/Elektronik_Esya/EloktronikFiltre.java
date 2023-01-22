
package paradoks.Elektronik_Esya;
public class EloktronikFiltre extends Elektronik_ana_klasor{
   public void Filtrele(){
       Bilgisayar pc=new Bilgisayar();
       Telefon tel=new Telefon();
       Elektronik_Aksesuar aks=new Elektronik_Aksesuar();
       
       System.out.println("1-Bilgisayar\n"
               + "2-Telefon\n"
               + "3-Elektronik Aksesuar");
       System.out.print("Kategori seciniz:");
       int sec=input.nextInt();
       switch (sec) {
           case 1:
               System.out.println("Bilgisayar alanimiza hosgeldiniz...");
               pc.Marka(getMarka());
               pc.ramMiktari();
               pc.usbTuru();
               pc.sonuc();
               break;
            case 2:
               System.out.println("Telefon alanimiza hosgeldiniz...");
               tel.Marka(marka);
               tel.ramMiktari();
               tel.kameraMp();
              // tel.Fiyat();
               tel.sonuc();
               break;
            case 3:
               System.out.println("Elektronik Aksesuar alanimiza hosgeldiniz...");
               aks.secilecek();
               aks.Marka(marka);
               Filtrele();
               //aks.Fiyat();
               
               
              
               break;   
           default:
               System.out.println("Boyle bir secenek bulunmamaktadir!!!");
               Filtrele();
               
       }
   
   }
}
