
package test;

import java.util.Date;

public class RespirationSensor extends Sensor {
      
    
    public RespirationSensor()
    {
        this.id= "Rx" + Integer.toString((int)(Math.random()*(99-10)+10));
        this.value=(int)(Math.random()*(25-2)+2);
        this.timeStamp = new Date();
        
    }
}
