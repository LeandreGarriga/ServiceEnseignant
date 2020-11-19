package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
    private int volumeCM;
    private int volumeTP;
    private int volumeTD;
    
        public ServicePrevu(int cm, int td, int tp){
            this.volumeCM=cm;
            this.volumeTP=td;
            this.volumeTD=tp;
        }
        
        public void AjoutHeure(int cm, int td, int tp){
            this.volumeCM =+ cm;
            this.volumeTD =+ td;
            this.volumeTP =+ tp;
        }
        
        public void setServicePrevu(int cm, int td, int tp){
            this.volumeCM=cm;
            this.volumeTP=td;
            this.volumeTD=tp;
        }

}
