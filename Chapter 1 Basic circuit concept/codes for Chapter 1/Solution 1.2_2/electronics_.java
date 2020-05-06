
import java.util.*;
public class electronics_ {
   public static void main(String[] args) {

      int[] voltage = new int[5];
      int[] current = new int[5];
      int[] power   = new int[5];
      int wPower=0;
      Scanner sc_voltage = new Scanner(System.in);
      System.out.println("Please input the voltage");
      for(int i = 0; i < voltage.length; i++){
            voltage[i] = sc_voltage.nextInt();
        }

      System.out.println("the value of voltage is:"+"\n");
      for (int i = 0; i < voltage.length; i++) {
         System.out.print(voltage[i]+"Volts"+" ");

      }
      System.out.println("\n");
      Scanner sc_current = new Scanner(System.in);
      System.out.println("Please input the current");
      for(int i = 0; i < current.length; i++){
            current[i] = sc_current.nextInt();
        }

      System.out.println("the value of current is:"+"\n");
      for (int i = 0; i < current.length; i++) {
         System.out.print(current[i]+"ampere"+" ");

      }

      System.out.println("\n");
      System.out.println("the value of power is:"+"\n");
      for (int i = 0; i < 5; i++) {
         power[i]=voltage[i]*current[i];
         System.out.print(power[i]+"walts"+" " );
         wPower+=power[i];
      }
        System.out.println("\n");
        System.out.println("the total of power is:"+ wPower+"walt");
     
   }
}