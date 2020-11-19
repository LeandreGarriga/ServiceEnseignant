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

import java.util.Date;

public class Intervention {
    private Date debut;
    private Date fin;
    private boolean annulée = false;
    
    public Intervention(Date deb, Date fin, UE u,Salle s,Enseignant e){
        this.debut=deb;
        this.fin=fin;
        UE ue = u;
        Salle classe = s;
        Enseignant prof = e;
    
    }
}
