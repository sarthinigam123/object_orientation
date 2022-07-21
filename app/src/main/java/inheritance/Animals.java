package inheritance;

public class Animals {
    private String species;
    private String biologicalName;
    private String commonName;
    private boolean carnivorous;

    public Animals(String species, String biologicalName, String commonName){
        this.species = species;
        this.biologicalName = biologicalName;
        this.commonName = commonName;
    }

    public void setSpecies(String species){
        this.species = species;
    }
    public void setBiologicalName(String biologicalName){
        this.biologicalName = biologicalName;
    }
    public void setCommonName(String commonName){
        this.commonName= commonName;
    }
    public void setCarnivorous(boolean carnivorous){
        this.carnivorous= carnivorous;
    }

    public String getSpecies(){
        return species;
    }
    public String getBiologicalName(){
        return biologicalName;
    }
    public String getCommonName(){
        return commonName;
    }
    public boolean getCarnivorous(){
        return carnivorous;
    }
}
