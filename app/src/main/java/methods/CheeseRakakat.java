package methods;

public class CheeseRakakat {
    public CheeseRakakat() {
        System.out.println("Making a Cheese Rakakat");
    }

    public CheeseRakakat mixingIngredients(String cheese) {
        System.out.println("Mixing shredded" + cheese + " , oregano, toasted sesame seeds and coriander leaves ");
        return this;
    }

    public CheeseRakakat makingRolls() {
        System.out.println("Spreading an adequate amount, rolling in the form of log and sealing the edges using water");
        return this;
    }

    public CheeseRakakat fryingRolls() {
        System.out.println("Frying the rolls in a deep fryer until golden");
        return this;
    }

    public CheeseRakakat servingRolls() {
        System.out.println("Serving them hot with ketchup or mayo");
        return this;
    }

    public static void main(String[] args) {
        CheeseRakakat cheeseRakakat = new CheeseRakakat();
        cheeseRakakat
                .mixingIngredients("mozzarella cheese")
                .makingRolls()
                .fryingRolls()
                .servingRolls();
    }
}