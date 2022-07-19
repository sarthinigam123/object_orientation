package objects;

public class PumpkinSoup {
    public PumpkinSoup(){
        System.out.println("Preparing Pumpkin Soup....");
    }

    public PumpkinSoup heatingSaucePan(){
        System.out.println("Heating saucepan with oil over low heat....");
        return this;
    }

    public PumpkinSoup addVeggies(int minutes){
        System.out.printf("Adding onion and leek and cooking for %s minutes until softened" , minutes);
        System.out.println();
        return this;
    }

    public PumpkinSoup addSpices(int seconds){
        System.out.printf("Adding garlic and spices and cooking for %s seconds" , seconds);
        System.out.println();
        return this;
    }

    public PumpkinSoup addPumpkin(String potato, int simmerMinutes){
        System.out.println("Adding pumpkin and " + potato + " and stirring");
        System.out.println("Letting the soup simmer for " + simmerMinutes + "minutes");
        return this;
    }

    public PumpkinSoup finishingCooking(){
        System.out.printf("Allowing to cool and then blending in batches");
        System.out.printf("Stirring through the cream and reheating gently");
        return this;
    }

    public PumpkinSoup serve(){
        System.out.printf("Serving Soup");
        return this;
    }

    public static void main(String[] args) {
        PumpkinSoup pumpkinSoup = new PumpkinSoup();
        pumpkinSoup
                .heatingSaucePan()
                .addVeggies(3)
                .addSpices(30)
                .addPumpkin("Potato", 30)
                .finishingCooking()
                .serve();
    }
}
