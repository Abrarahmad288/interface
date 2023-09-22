package interfacepractice;

public class Bicycle1 implements Vehicle{
	int speed;
    int gear;
     
    
    
    public void changeGear(int newGear){
         
        gear = newGear;
    }
     
    
  
    public void speedUp(int increment){
         
        speed = speed + increment;
    }
     
       
    public void applyBrakes(int decrement){
         
        speed = speed - decrement;
    }
     
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);

}
}
