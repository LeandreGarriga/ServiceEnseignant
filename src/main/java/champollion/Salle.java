/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

/**
 *
 * @author leand
 */
public class Salle {
    
    private final String intitule;
    private int capacité;
    
    public Salle(String intitule, int capacité){
        this.intitule = intitule;
        this.capacité = capacité;
    }
    
    public String getIntitule(){
        return intitule;
    }
    
    public int getCapacité(){
        return capacité;
    }
    
    public void setCapacité(int capacité){
        this.capacité = capacité;
    }
    
}
