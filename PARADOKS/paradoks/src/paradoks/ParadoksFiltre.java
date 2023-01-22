package paradoks;
import paradoks.Elektronik_Esya.EloktronikFiltre;
import paradoks.Emlak.EmlakFiltrele;
import paradoks.Tasit.TasitFiltrele;
import java.util.Scanner;
public class ParadoksFiltre extends VeriTabani{
 public void paradoks(){
     EloktronikFiltre elektronik=new EloktronikFiltre();
     EmlakFiltrele emlak=new EmlakFiltrele();
     TasitFiltrele tasit=new TasitFiltrele();
     Scanner input=new Scanner(System.in);
     
     System.out.println("1-Elektronik_Esya\n"
             + "2-Emlak\n"
             + "3-Tasit");
     System.out.print("Hangi kategori'de devam etmek istersiniz:");
     int sec=input.nextInt();
     switch (sec) {
         case 1:
             System.out.println("Elektronik Esya bolumune hosgeldiniz...");
             elektronik.Filtrele();
             break;
         case 2:
             System.out.println("Emlak bolumune hosgeldiniz...");
             emlak.EmlakFiltrele();
             break;
         case 3:
             System.out.println("Tasit bolumune hosgeldiniz...");
             tasit.TasitFiltrele();
             break;
         default:
             System.out.println("Boyle bir secenek bulunamadi!!!");
             System.out.println("Tekrar deneyiniz...");
             paradoks();
     }
 }
}
