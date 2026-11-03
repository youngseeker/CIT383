class Cup {
    public void addLiquid() { 
        System.out.println("Liquid swirls clockwise"); 
    }
}

class CoffeeCup extends Cup {
    // inherits addLiquid() unchanged from Cup
}

class TeaCup extends Cup {
    @Override
    public void addLiquid() { 
        System.out.println("Liquid swirls anticlockwise"); 
    }
}

public class CupTest {
    public static void main(String[] args) {
        // Create objects for each cup type
        Cup genericCup = new Cup();
        Cup coffeeCup = new CoffeeCup(); // Demonstrates inheritance
        Cup teaCup = new TeaCup();       // Demonstrates polymorphism

        // Call the addLiquid method on each
        System.out.print("Generic Cup: ");
        genericCup.addLiquid();

        System.out.print("Coffee Cup: ");
        coffeeCup.addLiquid();

        System.out.print("Tea Cup: ");
        teaCup.addLiquid();
    }
}