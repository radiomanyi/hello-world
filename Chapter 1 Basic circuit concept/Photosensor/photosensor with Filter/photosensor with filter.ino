
#define FILTER_N 10
#include <LiquidCrystal.h>

LiquidCrystal lcd(6, 7, 5, 4, 3, 2);
float input_voltage = 0.0;
float temp=0.0;
float Filter_Value =0.0;

float Get_AD();
float Filter();


void setup()
{
   Serial.begin(9600);     //  opens serial port, sets data rate to 9600 bps
   lcd.begin(16, 2);       //// set up the LCD's number of columns and rows: 
   lcd.print("DIGITAL VOLTMETER");
}
void loop()
{

//Conversion formula for voltage
   Filter_Value = Filter(); 
   if (input_voltage < 0.1) 
   {
     input_voltage=0.0;
   } 
    Serial.print("v= ");
    Serial.println(input_voltage);
    lcd.setCursor(0, 1);
    lcd.print("Voltage= ");
    lcd.print(input_voltage);
    delay(300);
}
float Get_AD() {
   int analog_value = analogRead(A5);
   input_voltage = ((analog_value * 5.0) / 1024.0)-0.20; 
   return input_voltage;
}

float Filter() {
  int i;
  float filter_sum = 0;
  for(i = 0; i < FILTER_N; i++) {
    filter_sum += Get_AD();
    delay(1);
  }
  return (float)(filter_sum / FILTER_N);
}
