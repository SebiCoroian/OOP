
package test;

public class Main {
    public static void main(String[] args)
    {
        RespirationSensor RS = new RespirationSensor();

        TemperatureSensor TS = new TemperatureSensor();
        
        RespirationSensor RS1 = new RespirationSensor();

        TemperatureSensor TS1 = new TemperatureSensor();
        
        Pacient P1=new Pacient("Coroian", "Sebastian", "123",RS,TS);
        Pacient P2=new Pacient("Blaj", "Andrei", "456",RS1,TS1);
        
        System.out.println(P1.getNume());
    }
    
}
