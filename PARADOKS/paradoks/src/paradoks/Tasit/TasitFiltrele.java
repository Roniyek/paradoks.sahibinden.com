package paradoks.Tasit;
public class TasitFiltrele extends Tasit_ana_klasor{
     Araba arac = new Araba();
     Motor mot =new Motor();
     public void TasitFiltrele(){
        System.out.println("Tasit sayfamiza hosgeldiniz...");
       System.out.println("1-Araba\n"
               + "2-Motor");
       System.out.print("Kategori seciniz:");
       //input miras alınıyor
       int sec=input.nextInt();
       switch (sec) {
           case 1:
               System.out.println("Araba sayfasına hosgeldiniz...");
               arac.Marka();
               arac.sonuc();
               //arac.Fiyat();
               
               break;
            case 2:
               System.out.println("Motor sayfasına hosgeldiniz...");
              mot.Motor_Gucu();
              mot.sonuc();
             // mot.Fiyat();
               break;
            
           default:
               System.out.println("Boyle bir secenek bulunmamaktadir!!!");
               TasitFiltrele();
               
       }
    }
}
