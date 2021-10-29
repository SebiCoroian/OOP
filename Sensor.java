
package test;

import java.util.Date;

public class Sensor {
    protected String id;
    protected int value;
    protected Date timeStamp;
    
    public Sensor()
    {
 
    }
    
    public void setId(String id)
    {
        this.id=id;
    }
    public String getId()
    {
        return this.id;
    }
     public void setCurrentValue(int value)
    {
        this.value=value;
    }
    public int getCurrentValue()
    {
        return this.value;
    } public void setTime(Date timeStamp)
    {
        this.timeStamp=timeStamp;
    }
    public Date getTime()
    {
        return this.timeStamp;
    }
}
