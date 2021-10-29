
package test;

public class Pacient {
    private String nume;
    private String prenume;
    private String CNP;
    private RespirationSensor RS;
    private TemperatureSensor TS;
   
    public Pacient(String nume, String prenume, String CNP, RespirationSensor RS, TemperatureSensor TS)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.CNP=CNP;
        this.RS=RS;
        this.TS=TS;
        
    }
    
    public void setNume(String nume)
    {
        this.nume=nume;
    }
    public String getNume()
    {
        return this.nume;
    }
    public void setPrenume(String prenume)
    {
        this.prenume=prenume;
    }
    public String getPrenume()
    {
        return this.prenume;
    }
    public void setCNP(String CNP)
    {
        this.CNP=CNP;
    }
    public String getCNP()
    {
        return this.CNP;
    }
    public void setTS(TemperatureSensor TS)
    {
        this.TS=TS;
    }
    public TemperatureSensor getTS()
    {
        return this.TS;
    }
    public void setRS(RespirationSensor RS)
    {
        this.RS=RS;
    }
    public RespirationSensor getRS()
    {
        return this.RS;
    }
}

