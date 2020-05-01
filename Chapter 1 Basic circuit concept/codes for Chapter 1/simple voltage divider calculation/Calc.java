
import java.util.Scanner;
class circuit{
	/*
	 *the function of ohm's law
	 *the function of voltage divider
	 */
	double[] resistance = new double[3];
	double battery;

	public double ohmL(double i,double v){
		double r;
		r=v/i;
		return r;
	}

	public double[] generalRes(double r,double r1, double r2){
		double[] rcal = new double[3];
		rcal[0] = r+(r1*r2)/(r1+r2);  // calc the general resistor
		rcal[1] = r2/(r1+r2);		  // calc the coeffcient of branch 1
		rcal[2] = r1/(r1+r2);		  // calc the coeffcient of branch 2
		return rcal ;
	}

    public void display(){
    	System.out.print("Resistors are as follows: ");
    	for(int i=0;i<3;i++)
    	{System.out.print(this.resistance[i]+"ohm ");} 
		 System.out.println("\n");
		 System.out.println("Battery is: "+this.battery+"volts\n");
	}

}
public class Calc{
	public static void main(String args[])
	{
    circuit mycircuit = new circuit();
    System.out.println("Input your resisor values: unit ohm");
    Scanner res = new Scanner(System.in);
     for(int i=0; i<3; i++) {
         mycircuit.resistance[i] = res.nextDouble();
     }

     System.out.println("Input your battery value is: unit Volts");
     Scanner bat = new Scanner(System.in);
     double newbattery = bat.nextDouble();
     mycircuit.battery = newbattery;
     System.out.println("\n");
     mycircuit.display();
    
     double zRes[] = mycircuit.generalRes(mycircuit.resistance[0],mycircuit.resistance[1],mycircuit.resistance[2]);
     
     System.out.println("General Resistor is: "+String.format("%.2f",zRes[0])+"ohm\n");


     System.out.print("I1 = "+String.format("%.2f",mycircuit.battery/zRes[0])+"A\t");
     System.out.print("I2 = "+String.format("%.2f", (mycircuit.battery/zRes[0])*zRes[1])+"A\t");
     System.out.print("I3 = "+String.format("%.2f", (mycircuit.battery/zRes[0])*zRes[2])+"A\t");

	}
}