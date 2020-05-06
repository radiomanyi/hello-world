
public class electronics {
   public static void main(String[] args) {

      int[] voltage = {30, 10, 20, 8, 12};
      int[] current = {-10, 10,14,-4, -4 };
      int[] power   = {0, 0, 0, 0, 0 };
      int wPower=0;
 
      System.out.println("the value of voltage is:"+"\n");
      for (int i = 0; i < voltage.length; i++) {
         System.out.print(voltage[i]+"Volts"+" ");

      }
      System.out.println("\n");
      System.out.println("the value of current is:"+"\n");
      for (int i = 0; i < current.length; i++) {
  
         System.out.print(current[i]+"Ampere"+" " );
      }
        System.out.println("\n");

        System.out.println("the value of power is:"+"\n");
      for (int i = 0; i < power.length; i++) {
         power[i]=voltage[i]*current[i];
         System.out.print(power[i]+"walts"+" " );
         wPower+=power[i];
      }
        System.out.println("\n");
        System.out.println("the total of power is:"+ wPower+"walt");
     
   }
}