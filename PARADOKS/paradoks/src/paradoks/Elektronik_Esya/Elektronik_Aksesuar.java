package paradoks.Elektronik_Esya;
public class Elektronik_Aksesuar extends Elektronik_ana_klasor{
    
    public String telefonKilif;
    public String saat;
    public String sarjKablosu;
    //marka
    public String Marka(String marka){
       
        System.out.println("1-Huawei\n"
                + "2-Samsung\n"
                + "3-Apple");
     System.out.println("Marka seciniz");
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
    //secilecek
    public int secilecek(){
          System.out.println("1-Telefon kilifi\n"
                + "2-Saat\n"
                + "3-Sarj kablosu\n");
        System.out.print("ihtiyaciniz olan esyayi seciniz:");
        int sec=input.nextInt();
         switch (sec) {
            case 1:
                System.out.println("Secilen esya Telefon kilifi");
                break;
                case 2:
                System.out.println("Secilen esya Saat");
                break;
                case 3:
                System.out.println("Secilen esya Sarj kablosu");
                break;
            default:
                System.out.println("Boyle bir esyamiz bulunmamaktadir.");
                return secilecek();
        }
         return 0;
    }
   
    
     
}
