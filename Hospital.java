/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;

/**
 *
 * @author sebi
 */
public class Hospital {
    private ArrayList<Pacient> pacienti=new ArrayList<Pacient>();
    public Hospital(ArrayList<Pacient> pacienti)
    {
        this.pacienti=pacienti;
    }
    public void setPacienti(ArrayList<Pacient> pacienti)
    {
        this.pacienti=pacienti;
    }
    public ArrayList<Pacient> getPacienti()
    {
        return this.pacienti;
    }
}
