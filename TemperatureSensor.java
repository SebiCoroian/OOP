
package test;

import java.util.Date;

public class TemperatureSensor extends Sensor {
      
    
    public TemperatureSensor()
    {
        this.id= "Tx" + Integer.toString((int)(Math.random()*(99-10)+10));
        this.value=(int)(Math.random()*(40-36)+36);
        this.timeStamp = new Date();
        
    }
}
