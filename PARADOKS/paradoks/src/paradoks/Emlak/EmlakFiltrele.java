package paradoks.Emlak;
public class EmlakFiltrele extends Emlak_ana_klasor{
    Arsa ar = new Arsa();
    Isyeri is =new Isyeri();
    Konut ev = new Konut();
    Otel oda= new Otel();
    public void EmlakFiltrele(){
        System.out.println("Emlak sayfamiza hosgeldiniz...");
       System.out.println("1-Konut\n"
               + "2-Is yeri\n"
               + "3-Otel\n"
               + "4-Arsa");
       System.out.print("Kategori seciniz:");
       int sec=input.nextInt();
       switch (sec) {
           case 1:
               System.out.println("Konut sayfasına hosgeldiniz...");
               ev.tapuDurumu();
               ev.odaSayisi();
               ev.isitma();
               ev.sonuc();
              // ev.Fiyat();
               break;
            case 2:
               System.out.println("Is Yeri sayfasına hosgeldiniz...");
               is.bolmesayisi();
               is.isitma();
               is.sonuc();
              // is.Fiyat();
               break;
            case 3:
               System.out.println("Otel sayfasına hosgeldiniz...");
               oda.daireTuru();
               oda.sonuc();
               //oda.Fiyat();
               break;   
            case 4:
                System.out.println("Arsa sayfasına hosgeldiniz...");
                ar.imarDurum();
                ar.tapuDurumu();
                ar.sonuc();
                //ar.Fiyat();;
                break;
           default:
               System.out.println("Boyle bir secenek bulunmamaktadir!!!");
               EmlakFiltrele();
               
       }
       
    }
    
}
