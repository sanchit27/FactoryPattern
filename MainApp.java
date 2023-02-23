public class MainApp {
    public static void main(String[] args) {
        Pizza margherita = PizzaFactory.createPizza("Margherita");
        margherita.prepare();
        margherita.bake();
        margherita.cut();
        margherita.box();

        Pizza veggie = PizzaFactory.createPizza("Veggie");
        veggie.prepare();
        veggie.bake();
        veggie.cut();
        veggie.box();
    }
}
