package interfacepractice;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle1 bi = new Bicycle1();
		bi.changeGear(2);
		bi.speedUp(3);
		bi.applyBrakes(1);
         
        System.out.println("Bicycle present state :");
        bi.printStates();
         
        
        Bike1 bike = new Bike1();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
         
        System.out.println("Bike present state :");
        bike.printStates();
    }
	}

interface Vehicle {
    
    
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
 
class Bicycle implements Vehicle{
     
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
 
class Bike implements Vehicle {
     
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
