package academy.learnprogramming;

public class Lamborghini extends Car{
   private int roadServiceMonths;

   public Lamborghini(int roadServiceMonths) {
      super("Lambo", "4WD", 5, 3, 6, false);
      this.roadServiceMonths = roadServiceMonths;
   }

   public void accelerate(int rate){
      int newVelocity=getCurrentVelocity()+rate;
      if(newVelocity==0){
         stop();
         changeGear(1);
      }else if(newVelocity>0&&newVelocity<=40){
         changeGear(1);
      }else if(newVelocity>40&&newVelocity<=70){
         changeGear(2);
      }else if(newVelocity>70&&newVelocity<=100){
         changeGear(3);
      }else if(newVelocity>100&&newVelocity<=140){
         changeGear(4);
      }else if(newVelocity>140&&newVelocity<=170){
         changeGear(5);
      }else{
         changeGear(6);
      }
      if(newVelocity>0){
         changeVelocity(newVelocity,getCurrentDirections());
      }
   }
}
