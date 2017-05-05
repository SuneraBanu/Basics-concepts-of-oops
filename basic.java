package oppconcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Abstract Class
 abstract class VehicleAbstract 
 {  
    public abstract void start();  
    private String manufacturer;
    private String model;
    private int cost;
//Constructor to set properties/characteristics of object  (Encapsulation)
    VehicleAbstract(String man,String m, int c){  
        this.manufacturer = man;   
        this.model=m;  
        this.cost=c;  
    }  
//Method to get access Model property of Object  
    public String getModel()
    {  
        return this.model; 
    }
    public String getManufacturer()
    {
		return this.manufacturer;
    }
    public int getcost()
    {
    	return this.cost;
    }
//Method to implement overloading
    public void print(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
 //Method to implement Abstract 
	public void stop(){  
        System.out.println("Stopping Vehicle in abstract class");  
    }  
}  
//Inheritance-1
class TwoWheeler extends VehicleAbstract{  TwoWheeler(String man, String m, int c) {
		super(man, m, c);
		// TODO Auto-generated constructor stub
	}
@Override
    public void start() {  
        System.out.println("Starting Two Wheeler");       
 }     
}  
//Inheritance 2
class FourWheeler extends VehicleAbstract{  
    FourWheeler(String man, String m, int c) {
		super(man, m, c);
		// TODO Auto-generated constructor stub
	}
  //Method to implement overloading
    public void print(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
    }
	@Override  
    public void start() {  
        System.out.println("Starting Four Wheeler");  
    }  
}

public class VehicleTesting {
	public static void main(String[] args) throws NumberFormatException, IOException {  
        int count=1;
        do
        {
        	
        
        
        	System.out.println("********************************");
            System.out.println("Press 1 for Two Wheeler and 2 for Four Wheeler Details");
            BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
            int two= Integer.parseInt(input.readLine());
        
       switch(two)
       {
       case 1:
    	   VehicleAbstract my2Wheeler = new TwoWheeler("BMW","R1200RT", 100000);  //overriding method
    	   my2Wheeler.print("Two wheeler");//Method Overloading
           System.out.println("Manufacturer :"+my2Wheeler.getManufacturer());//calling the overriding method
           System.out.println("Model Number :"+my2Wheeler.getModel());
           System.out.println("Cost :"+my2Wheeler.getcost());
           my2Wheeler.start(); //Inheritance-1 
           my2Wheeler.stop();  //Abstract class
           break;
           
       case 2:
    	   VehicleAbstract my4Wheeler = new FourWheeler("BMW", "3/15PS",2000000);  
    	   my4Wheeler.print("Four Wheeler");
           System.out.println("Manufacturer :"+my4Wheeler.getManufacturer());//calling the overriding method
           System.out.println("Model Number :"+my4Wheeler.getModel());
           System.out.println("Cost :"+my4Wheeler.getcost());
           my4Wheeler.start(); //Inheritance-2
           my4Wheeler.stop();  //Abstract class
          break;
       default:
    	   System.exit(0);
    	  
       }
	}
	while(count<10);
        
        
        
    }  
}  
