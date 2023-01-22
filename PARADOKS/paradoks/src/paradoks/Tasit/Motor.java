package paradoks.Tasit;
public class Motor extends Tasit_ana_klasor{
    public String motorGucu;
    public String yakit;
    //motor gucu
    public void Motor_Gucu() {
        System.out.println("Motor gucu Seciniz:");
        System.out.println("1- 25Hp\n"
                + "2- 50Hp\n"
                + "3- 75Hp\n"
                + "4- 100Hp");
        int sec=input.nextInt();
    if(sec==1){
          motorGucu="25Hp";
          System.out.println(motorGucu);
      }
    else if(sec==2){
         motorGucu="50Hp";
         System.out.println(motorGucu);
      }
    
    else if(sec==3){
        motorGucu="75Hp";
        System.out.println(motorGucu);
      }
     else if(sec==4){
         motorGucu="100Hp";
         System.out.println(motorGucu);
      }
     else{
         System.out.println("Yanlis islem girdiniz!!!");
         Motor_Gucu();
     }
    }
    public void sonuc(){
        System.out.println(motorGucu+"'ne Sahip motor alindi...");
    }
}
