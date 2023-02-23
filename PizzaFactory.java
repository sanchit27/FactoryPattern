public class PizzaFactory {
    public static Pizza createPizza(String type) {
        switch (type) {
            case "Margherita":
                return new MargheritaPizza();
            case "Veggie":
                return new VeggiePizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}
