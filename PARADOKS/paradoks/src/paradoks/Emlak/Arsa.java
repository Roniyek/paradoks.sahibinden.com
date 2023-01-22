package paradoks.Emlak;
public class Arsa extends Emlak_ana_klasor implements Arsa1{
    private String imarDurumu;
    
    public void imarDurum(){
                
            System.out.println("1- imara acik \n"
                    + "2-imara kapali");
            int islem=input.nextInt();
        
         input.nextLine();
      
      
      if(islem==1){
          imarDurumu="imara acik ";
          System.out.println(imarDurumu);
      }
    else if(islem==2){
          imarDurumu="imara kapali";
          System.out.println(imarDurumu);
      }
    
    
     else{
         System.out.println("Yanlis islem girdiniz!!!");
        imarDurum();
     }
     
}
     public void sonuc(){
        
            System.out.println(tapuDurumu+" olan "+imarDurumu+" arsa alindi...");
    }

}