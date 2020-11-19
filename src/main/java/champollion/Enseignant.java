package champollion;

import java.util.HashMap;
import java.util.Set;

public class Enseignant extends Personne {

    // TODO : rajouter les autres méthodes présentes dans le diagramme UML
    private HashMap<UE, HashMap<TypeIntervention, Integer>> enseignement = new HashMap<>();
     HashMap<TypeIntervention, Integer> innerMap = new HashMap<>();
    private int heureTotalFormatTD=0;
    private Set<Intervention> Inter;
    
    
    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        
        for (UE i : enseignement.keySet()){
            int heureCM = enseignement.get(i).get(TypeIntervention.CM);
            int heureTP = enseignement.get(i).get(TypeIntervention.TP);
            int heureTD = enseignement.get(i).get(TypeIntervention.TD);
        
            int heureTotalFormatTDUE= (int) ((heureCM*1.5)+ (heureTP*0.75) + heureTD);
            heureTotalFormatTD =+ heureTotalFormatTDUE;
        }
        return heureTotalFormatTD;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        int heureCM = enseignement.get(ue).get(TypeIntervention.CM);
        int heureTP = enseignement.get(ue).get(TypeIntervention.TP);
        int heureTD = enseignement.get(ue).get(TypeIntervention.TD);
        
        int heureTotalFormatTDUE= (int) ((heureCM*1.5)+ (heureTP*0.75) + heureTD);
        return heureTotalFormatTDUE;
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        // TODO: Implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        
        if (enseignement.get(ue)== null){
            innerMap.put(TypeIntervention.CM, volumeCM);
            innerMap.put(TypeIntervention.TD, volumeTD);
            innerMap.put(TypeIntervention.TP, volumeTP);
            
            enseignement.put(ue,innerMap);
        }
        else{
            int heureCM = enseignement.get(ue).get(TypeIntervention.CM);
            int heureTD = enseignement.get(ue).get(TypeIntervention.TD);
            int heureTP = enseignement.get(ue).get(TypeIntervention.TP);
        
            heureCM =+ volumeCM;
            heureTD =+ volumeTD;
            heureTP =+ volumeTP;
            
            enseignement.remove(ue);
            
            innerMap.put(TypeIntervention.CM, heureCM);
            innerMap.put(TypeIntervention.TD, heureTD);
            innerMap.put(TypeIntervention.TP, heureTP);
        
            enseignement.put(ue,innerMap);
        }
        
    }
    
    public void ajouteIntervention(Intervention e){
        //throw new UnsupportedOperationException("Pas encore implémenté");
        Inter.add(e);
    }
    
    public int heuresPlanifiées(){
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

    public boolean enSousService(){
        //Si le nombre d'heures prévues et différent du nombre d'heures planifiées
        if (this.heuresPrevues() > this.heuresPlanifiées()){
            //Alors l'enseignant est pour l'instant en sous service
            return true;
        }
        return false;
    }
}
